package review;

public class TwoHunderdSix {
    //206 反转链表
    public ListNode reverseList(ListNode head){
        ListNode node = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = node;
            node =curr;
            curr = temp;
        }return node;
    }
}
//本题核心：维护三个链表，一个为当前操作链表，一个前链表，一个后链表
