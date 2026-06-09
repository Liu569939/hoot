public class sixeightB {
    //hoot 208 实现前缀树
    class Trie {
        private class Node{
            private Node [] children = new Node [26];
            boolean isEnd = false;
        }
        private final Node node = new Node();
        public Trie() {

        }

        public void insert(String word) {
            Node root = node;
            for(char c : word.toCharArray()){
                int index  = c - 'a';
                if(root.children[index] == null){
                    root.children[index] = new Node();
                }root = root.children[index];
            }root.isEnd = true;
        }

        public boolean search(String word) {
            return match(word) == 1;
        }

        public boolean startsWith(String prefix) {
            return match(prefix) !=-1;
        }
        private int match (String s ){
            Node root = node;
            for(char c : s.toCharArray()){
                int index = c -'a';
                if(root.children[index] == null) return -1;
                root = root.children[index];
            }
            return root.isEnd?1:0;
        }
    }
}
//本题核心 : 通过建立数结构（如B数，一层存储26个子节点），实现前缀树，值得注意的是在单词某位字母处设置标识位，是否为末位
//同时每次判断玩当前元素后要递归到其子节点中进行判断
