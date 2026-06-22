package review;

public class TwoTyfive {
    //hoot 25. K 个一组翻转链表
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head);
        ListNode  curr = dummy;
        boolean  isParm  = true;
        ListNode temp = head;
        while(true){

            for(int i =0;i<k ; i++){
                if(temp==null){

                    isParm  = false;
                    break;
                }
                temp = temp.next;
            }
            if(!isParm){break;}
            ListNode node =head.next;

            ListNode tail = head;
            for(int i =1;i<k ; i++){
                ListNode prev  = node.next;
                node.next = head;
                head = node;
                node = prev;

            }
            tail.next = temp;
            curr.next = head;
            curr = tail;
            head = temp;
        }return dummy.next;
    }
}
//本题核心：先利用for循环判断剩余节点是否大于等于k，同时保持下一组的起点
//反转时先保证当组头节点，后遍历当组节点进行反转
//当组反转完毕后将头节点指向下一组的起点，同时移动头节点
//关于边界条件判断和节点移动难道较大
