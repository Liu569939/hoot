package review;

public class OneHunderdfortytwo {
    // hoot 142 环形链表II
    public ListNode detectCycle(ListNode head){
        if(head == null||head.next ==null||head.next.next==null){return null;}
        ListNode solw = head,fast =head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            solw = solw.next;
            if(solw == fast) {
                fast = head;
                while(fast!=solw){
                    solw =solw.next;
                    fast = fast.next;
                }return fast;

            }
        }return null;

    }
}
//本题核心就是利用数学，若存在圆环，在相交时将快指针置于起点和慢指针保持同样的速度移动，相遇即使入环点
