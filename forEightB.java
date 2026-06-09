public class forEightB {
    //hoot-21合并两个有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(li==null||l2==null){
            return li==null?l2:li;
        }
        ListNode cur = new ListNode(-1);
        ListNode dummy = cur;
        while(li!=null&&l2!=null){
            if(l1.val<l2.val){
               dummy.next = l1;
            }if(l1.val>=l2.val){
                dummy.next = l2;
            }
            dummy = dummy.next;
        }
        dummy.next = l1==null?l2:l1;
        return dummy;
    }

}
