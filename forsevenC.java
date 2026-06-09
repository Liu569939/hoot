public class forsevenC {
    //hoot-141 环形链表
    public boolean hayCircle(ListNode head) {
        if (head == null||head == head.next){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=slow){
            if(fast ==null||fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;

        }
        return true;
    }
}
