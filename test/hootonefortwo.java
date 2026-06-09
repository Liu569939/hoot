package test;

public class hootonefortwo {
    //hoot 142 环形链表II
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null){
            return l1==null?l2:l1;
        }
        ListNode prev = new ListNode(-1);
        ListNode curr = prev;
        while(l1!=null&&l2!=null){
            if(l1.val>=l2.val){
                curr.next =l2;
                l2 = l2.next;
            }else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr = curr.next;
        }
        curr.next  = l1==null?l2:l1;
        return  prev.next;
    }
}
