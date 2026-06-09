import java.lang.classfile.components.ClassPrinter;

public class forthereB {
    public ClassPrinter.ListNode getIntersectionNode(ClassPrinter.ListNode headA, ClassPrinter.ListNode headB){
        if(headA==null || headB==null){
            return null;
        }
        ClassPrinter.ListNode PA = headA;
        ClassPrinter.ListNode PB = headB;
        while(PA!=PB){
            PA = PA==null?headB:PA.next;
            PB = PB==null?headA:PB.next;
        }
        return PA;
    }


}
