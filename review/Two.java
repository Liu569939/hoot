package review;

public class Two {
    //hoot 2 两数相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode prev = new ListNode(-1);
        ListNode curr = prev;
        int      index =0;
        while(l1!=null&&l2!=null){
            int sum = l1.val+l2.val+index;
            index = sum/10;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            l1= l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int sum = l1.val+index;
            index = sum/10;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            l1 = l1.next;
        }
        while(l2!=null){
            int sum = l2.val+index;
            index = sum/10;
            ListNode temp = new ListNode(sum%10);
            curr.next = temp;
            curr = curr.next;
            l2 = l2.next;
        }
        if(index!=0){
            ListNode temp = new ListNode(index);
            curr.next = temp;
        }
        return prev.next;
    }
}
