public class sixeightD {
    //hoot 146 LRU缓存
    class LRUCache {
        private Map<Integer,Node> map;
        private Node first;
        private Node tail;
        private int  capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>(capacity);
            first =  new Node();
            tail  =  new Node();
            first.next = tail;
            tail.prev = first;
        }

        public int get(int key) {
            Node node = map.get(key);
            if(node == null)return -1;
            removeNode(node);
            addAfterFirst(node);
            return node.value;

        }
        private void removeNode(Node node){
            node.next.prev =node.prev;
            node.prev.next = node.next;
        }
        private void addAfterFirst(Node node){
            first.next.prev = node;
            node.next = first.next;
            first.next = node;
            node.prev = first;
        }

        public void put(int key, int value) {
            Node node = map.get(key);
            if(node != null){
                node.value = value;
                removeNode(node);
                addAfterFirst(node);
            }else{
                if(map.size() == capacity){
                    removeNode(map.remove(tail.prev.key));
                }
                node = new Node(key,value);
                map.put(key,node);
                addAfterFirst(node);
            }
        }
        private class Node{
            public int key;
            public int value;
            public Node prev;
            public Node next;
            public Node (){}
            public Node (int key,int value){
                this.key = key;
                this.value = value;
            }
        }
    }
}
//本题核心：有一点难，维护一个map和链表，map的key是节点的key，value是节点
//
