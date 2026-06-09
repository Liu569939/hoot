package test;

public class hoottwo {
    //hoot -2 两数相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode curr = new ListNode(-1);
        ListNode prev = curr;
        int sum=0,index =0;
        while(l1!=null&&l2!=null){
            sum = l1.val+l2.val+index;
            prev.next = new ListNode(sum%10);
            index  = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            prev = prev.next;
        }
        while(l1!=null){
            sum = l1.val+index;
            prev.next = new ListNode(sum%10);
            index = sum/10;
            l1 = l1.next;
            prev = prev.next;
        }
        while(l2!=null){
            sum  = l2.val+index;
            prev.next = new ListNode (sum%10);
            index = sum/10;
            l2 = l2.next;
            prev = prev.next;
        }
        if(index!=0){
            prev.next = new ListNode(index);
        }
        return curr.next;
    }
}
