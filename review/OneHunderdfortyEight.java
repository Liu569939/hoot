package review;

public class OneHunderdfortyEight {
    //148 排序链表
    public ListNode sortList(ListNode head) {
        return sortList(head,null);}

    ListNode sortList(ListNode head,ListNode node){
        if(head == null){return head;}
        if(head.next == node){
            head.next = null;
            return head;
        }
        ListNode solw = head;
        ListNode fast = head;
        while(fast!=node&&fast.next !=node){
            solw =solw.next;
            fast = fast.next.next;

        }
        ListNode node1 = sortList(head,solw);
        ListNode node2 = sortList(solw,node);
        ListNode root  = marge(node1,node2);
        return root;
    }
    ListNode marge(ListNode node1,ListNode node2){
        ListNode dummy = new ListNode(0);
        ListNode curr  = dummy;
        while(node1!=null&&node2!=null){
            if(node1.val>=node2.val){
                curr.next = node2;
                node2 = node2.next;
            }
            else {
                curr.next = node1;
                node1 = node1.next;
            }
            curr = curr.next;
        };
        curr.next = (node1!=null)?node1:node2;
        return dummy.next;
    }

}
//本题核心： 先将链表不断切割为单节点，后两两排序连接，最终得到排序链表
