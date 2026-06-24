package review;

public class OneHunderdNinetyNine {
    //hoot 199 二叉树的右视图
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }
    private void dfs(TreeNode root, List<Integer> res, int depth) {
        if(root == null) return;
        if(depth == res.size()) res.add(root.val);
        dfs(root.right, res, depth + 1);
        dfs(root.left, res, depth + 1);
    }
}
//本题核心： 利用队列的方式逐层遍历二叉树后将每层最后一个节点的值添加到结果列表中
// 方案二 ： 维护一个index变量表示当前行数，优先遍历右子树，当index变量与集合长度相同时，将当前节点值添加到结果列表中
//public List<Integer> rightSideView(TreeNode root) {
//
//    List<Integer> list = new ArrayList<>();
//    if(root ==null ) return list;
//    Queue<TreeNode> queue = new LinkedList<>();
//    queue.offer(root);
//    while(!queue.isEmpty()){
//        int len = queue.size();
//        for(int i =1;i<len;i++){
//            TreeNode node =  queue.poll();
//            if(node.left!=null){queue.offer(node.left);}
//            if(node.right!=null){queue.offer(node.right);}
//        }
//        TreeNode node =  queue.poll();
//        list.add(node.val);
//        if(node.left!=null){queue.offer(node.left);}
//        if(node.right!=null){queue.offer(node.right);}
//
//    }return list;

//}
