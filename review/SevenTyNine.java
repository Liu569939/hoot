package review;

public class SevenTyNine {
    //hoot 79 单词搜索
    List<List<String>> list = new ArrayList<>();
    boolean [][] isPal ;
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<String> curr = new ArrayList<>();
        isPal = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || isPal[i + 1][j - 1])) {
                    isPal[i][j] = true;
                }
            }
        }
        dfs(curr,s,0);
        return list;

    }
    void dfs(List<String> curr,String s,int start){
        if(start == s.length()){ list.add(new ArrayList<>(curr)); return ;}
        for(int end = start;end<s.length();end++){
            if(isPal[start][end]){
                curr.add(s.substring(start,end+1));
                dfs(curr,s,end+1);
                curr.remove(curr.size()-1);
            }
        }
    }

}
