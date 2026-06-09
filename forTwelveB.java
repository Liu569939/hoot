public class forTwelveB {
    //hoot -24 反转相邻链表
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode temp = dummy;
        while(temp.next!=null && temp.next.next!=null){
            ListNode nodeone = temp.next;
            ListNode nodetwo = temp.next.next;
            nodeone.next = nodetwo.next;
            temp.next = nodetwo;
            nodetwo.next =nodeone;
            temp = nodeone;
        }
        ListNode ane = dummy.next;
        return ane;
    }
}
