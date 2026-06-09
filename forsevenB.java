import java.lang.classfile.components.ClassPrinter;
import java.util.ArrayList;
import java.util.List;

public class forsevenB {
    //hoot -234 回文链表
    public boolean isPalindrome(ClassPrinter.ListNode head){
        List<Integer> vals = new ArrayList<Integer>();
        while(head!=null){
            vals.add(head.val);
            head = head.next;
        }
        int left=0,right=vals.size()-1;
        while(left<right){
            if(!vals.get(left).equals(vals.get(right))){
                return false;
            }
            left++;
            right--;
            }
        return true;
        }
}
