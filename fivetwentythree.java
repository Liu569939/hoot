public class fivetwentythree {
    //hoot131 分割回文串
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        dfs(s,curr,0,0,list);
        return list;

    }
    void dfs(String s,List<String> curr, int index,int start,List<List<String>>list){
        if(index == s.length()){list.add(new ArrayList<>(curr));
            return ;}
        if(index<s.length()-1){
            dfs(s,curr,index+1,start,list);
        }
        if(isValid(s,index,start)){
            curr.add(s.substring(start,index+1));
            dfs(s,curr,index+1,index+1,list);
            curr.removeLast();
        }
    }
    boolean isValid(String s,int index,int start){
        while(index>start){
            if(s.charAt(index--)!=s.charAt(start++)) return false;
        }
        return true;
    }
    //注意事项
    //第一点：需要区分只有最有一个索引  不可分割。所以在最后一个索引前都可以选择不分割，其余字段都可以分割，所以index<s.length()-1
    //第二点： 将分割的字符进行isValid判断，是否为回文串，若是则进行递归后续的索引分割，传入dfs（s,curr,index+1,index+1,list）
}
