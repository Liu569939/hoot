package review;

public class twoHunderdthreetyfor {
    //234 回文链表
    public boolean isPalindrome(ListNode head){
        if(head.next==null){return true;}
        ListNode solw =head, fast = head;
        while(fast!=null&&fast.next!= null){
            solw = solw.next;
            fast =fast.next.next;
        }

        ListNode curr = revese(solw);
        boolean isPailnd = true;
        while(curr!=null){
            if(head.val!=curr.val){
                isPailnd = false;
                break;
            }
            curr = curr.next;
            head = head.next;

        }return isPailnd;

    }


}
//本题核心：快慢指针来找链表中间节点，后反转后续链表来依次比较从头节点开始的链表和从尾部开始反转的逆链表
//
