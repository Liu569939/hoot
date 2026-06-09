public class sixD {
    //hoot 25 K个一组翻转链表
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode curr = head;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        curr = head;
        ListNode temp = null;
        ListNode prev = null;
        ListNode dump = new ListNode(-1,head);
        ListNode ret = dump;
        for(;count>=k;count-=k){
            for(int i =0;i<k;i++){
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            dump.next.next = curr;
            temp = dump.next;
            dump.next = prev;
            dump = temp;
        }

        return ret.next;
    }
}
//本题核心 : 与反转链表思路类似 但有边界条件需要考虑
//第一点 :链表长度小于k时，不进行反转（需先统计链表总长度后k个一组）
//第二点 :每次反转都要更新dump哨兵节点，dump.next.next = curr;
