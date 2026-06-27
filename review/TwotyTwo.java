package review;

public class TwotyTwo {
    //hoot 22 括号生成
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        char [] ans = new char[2*n];
        dfs(list,ans,0,0,n);
        return list;
    }
    void dfs(List<String> list,char[] ans,int left,int
            right,int n){
        if(right==n){list.add(new String(ans)) ;return ;}
        if(left<n){
            ans[left+right] = '(';
            dfs(list,ans,left+1,right,n);


        }
        if(right<left){
            ans[left+right] = ')';
            dfs(list,ans,left,right+1,n);

        }
    }
}
