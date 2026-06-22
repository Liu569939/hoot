package review;

public class TyNine {
    //hoot 19 删除链表的倒数第N个节点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy,right = dummy;
        for(int i =0;i<=n;i++){
            right = right.next;
        }
        while(right!=null){
            right = right.next;
            left  = left.next;

        }left.next = left.next.next;
        return dummy.next;

    }
}
