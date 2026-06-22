package review;

public class TwotyFor {
    // hoot 24 两两交换链表中的节点
    public ListNode swapPairs(ListNode head) {
        if(head ==null||head.next ==null){return head;}
        ListNode dummy = new ListNode (0,head);
        ListNode curr  = dummy;
        while(curr.next != null&&curr.next.next!=null){
            ListNode node1 = curr.next;
            ListNode node2 = curr.next.next;
            node1.next = node2.next;
            node2.next = node1;
            curr.next = node2;
            curr = node1;


        }return dummy.next;
    }
}
//本题核心 ： 维护三个节点
