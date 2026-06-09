import java.util.ArrayList;
import java.util.List;

public class foreight {
    //hoot -142 环形链表II
public ListNode detectCycle(ListNode head){
    Set<ListNode> set = new HashSet<>();
    ListNode cur = head;
    while(cur!=null){
        if(set.contains(cur)){
            return cur;
        }
        set.add(cur);
        cur = cur.next;
    }
    return null;
}
}

