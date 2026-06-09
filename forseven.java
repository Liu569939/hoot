import java.awt.*;
import java.lang.classfile.components.ClassPrinter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class forseven {
    //hoot-206反转链表
    public ClassPrinter.ListNode reverseList(ClassPrinter.ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev
    }
}
