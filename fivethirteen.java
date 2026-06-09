public class fivethirteen {
    //hoot17  电话号码的字母组合
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            List<String> curr = new ArrayList<>();
            curr.add("abc");  // 2
            curr.add("def");  // 3
            curr.add("ghi");  // 4
            curr.add("jkl");  // 5
            curr.add("mno");  // 6
            curr.add("pqrs"); // 7
            curr.add("tuv");  // 8
            curr.add("wxyz");;
            letterCombinations(ans,curr,digits,new StringBuffer(),0);
            return ans;
        }
        public void letterCombinations(List<String> ans,List<String> curr,String digits,StringBuffer stringbuffer,int index){
            if(index == digits.length()-1){ans.add(stringbuffer.toString());}
            int digit = digits.charAt(index) - '2';
            String str = curr.get(digit);
            for(int i =0;i<str.length();i++){
                stringbuffer.append(str.charAt(i));
                letterCombinations(ans,curr,digits,stringbuffer,index+1);
                stringbuffer.deleteCharAt(index);
            }
        }
    }
    //值得注意的点：
    //首先list不能链式编码，list不支持链式编码
    //其次使用curr.get（i）获取数字对应的字母时要分两步，因为digits.charAt（i）获取的数字是char类型，需要转换成int类型
    //最后判断时要index = digits.length()，因为index表示当前stringbuffer长度+1（每次递归均index++）
}
