package review;

public class OneHunderdThreetyEight {
    //hoot 138 随机链表的复制
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        for(Node node = head;node!=null;node = node.next.next){
            Node curr  = new Node(node.val);
            curr.next  = node.next;
            node.next  = curr;
        }
        for(Node node = head;node!=null;node = node.next.next){
            Node curr = node.next;
            curr.random =node.random!=null?node.random.next:null;
        }
        Node cloneHead = head.next;
        for(Node node = head;node!=null;node = node.next){

            Node next = node.next;
            node.next =  next.next;
            next.next = next.next==null?null:node.next.next;

        }

        return cloneHead;
    }
}
//本题思路： 通过三轮复制，第一轮实现A ->A ` ->B ->B` -> C ->C`
//第二轮实现random值的复制
//第三轮再将复制的值移动出来
