package test;

public class three {
    class Solution {
        public int lengthOfLongestSubstring(String s){
            int left =0,max=0;
            int [] count = new int  [128];
            for(int right = 0;right<s.length();right++){
                char c = s.charAt(right);
                left = Math.max(left,count[c]);
                max = Math.max(max,right-left+1);
                count[c] = right+1;
            }

            return max;
        }
    }
}
