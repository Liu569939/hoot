package review;

public class OneHunderdSixty {
    //hoot 160 相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode pA = headA;
        ListNode pB = headB;
        while(pA != pB){
            pA =  pA== null?headB : pA.next;
            pB =  pB == null?headA : pB.next;

        }return pA;
    }
}
