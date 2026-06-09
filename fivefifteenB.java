public class fivefifteenB {
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        dfs(str,new StringBuilder(),0,0,n);
        return str;
    }
    void dfs(List<String> str,StringBuilder s,int left,int right,int n){
        if(right == n){str.add(s.toString());return;}
        if(left<n){s.append('(');
            dfs(str,s,left+1,right,n);
            s.deleteCharAt(s.length()-1);}
        if(right<left){
            s.append(')');
            dfs(str,s,left,right+1,n);
            s.deleteCharAt(s.length()-1);
        }
    }
    boolean is(int i){
        if(i==0){
            return fa
        }
    }
}
//hoot 22 括号生成
//主要判断如果left<n 就可以添加左括号，right<left 就可以添加右括号
