package review;

import java.util.ArrayList;
import java.util.List;

public class TySeven {
    //hoot 17 电话号码的字母组合
}
    int len;
    public List<String> letterCombinations(String digits) {
        len = digits.length()-1;
        List<String> ans = new ArrayList<>();
        List<String> indexs = new ArrayList<>();
        indexs.add("abc");
        indexs.add("def");
        indexs.add("ghi");
        indexs.add("jkl");
        indexs.add("mno");
        indexs.add("pqrs");
        indexs.add("tuv");
        indexs.add("wxyz");

        letterCombinations(ans,indexs,digits,0,new StringBuffer());
        return ans;
    }
    void letterCombinations(List<String> ans,List<String>indexs,String digits,int index,StringBuffer str){
        if(index==len){ans.add(str.toString());return ;}
        int k =  digits.charAt(index)-'2';
        String s= indexs.get(k);
        for(int i =0;i<s.length();i++){
            str.append(s.charAt(i));
            letterCombinations(ans,indexs,digits,index+1,str);
            str.deleteCharAt(str.length()-1);
        }
}
}
//本题核心 ： 先确定回溯的参数，然后确定回溯的终止条件，最后确定回溯的逻辑
