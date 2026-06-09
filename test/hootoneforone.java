package test;

public class hootoneforone {
    //hoot 141 环形链表
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return false;
        }
        ListNode solw = head,fast = head;
        while(fast!=null&&fast.next!=null){
            solw = solw.next;
            fast = fast.next.next;
            if(solw == fast){
                return true;
            }
        }return false;
    }
}
