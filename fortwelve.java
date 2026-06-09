public class fortwelve {
    //hoot-19 删除链表的倒数第N个结点
    public ListNode removeNthFromEnd(ListNode head, int n) {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0,head);

            ListNode first =head;
            ListNode temp = dummy;
            for(int i=0;i<n;i++){
                first = first.next;
            }
            while(first!=null){
                first = first.next;
                temp = temp.next;
            }
            temp.next= temp.next.next;
            ListNode ane =dummy.next;
            return ane;
        }
    }
