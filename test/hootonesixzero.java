package test;

public class hootonesixzero {
    //hoot 160 相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while(headA != headB){
            if(pA == pB){return pA;}
            pA =  pA == null? headB:pA.next;
            pB =  pB ==null?headA:pB.next;
        }
        return pA;
    }
}
