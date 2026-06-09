import java.util.HashSet;
import java.util.Set;

public class forsix {
    //寻找无重复字符的最长子串
    public int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int right = -1,leng= 0;
        for(int i=0;i<=s.length();i++){
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                set.remove(s.charAt(i - 1));
            }


            while (right + 1 < s.length() && !set.contains(s.charAt(right + 1))) {

                right++;
                set.add(s.charAt(right+1));
            }
            leng = Math.max(leng,right+1-i);
        }
         return leng;
    }
}
