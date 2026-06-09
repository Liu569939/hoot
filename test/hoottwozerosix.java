package test;

public class hoottwozerosix {
    //hoot206 反转链表
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode node = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = node;
            node = curr;
            curr = temp;

        }return node;
    }
}
