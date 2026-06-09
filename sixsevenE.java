public class sixsevenE {
    //hoot 5 最长回文子串
    public String longestPalindrome(String s) {
        char [] chars = s.toCharArray();
        int  len = s.length();
        int start = 0,end = 0;
        for(int i =0;i<len;i++){
            int left = i;
            int r = i;
            while(r<len&&left>=0&&chars[r] == chars[left]){
                left--;
                r++;
            }
            if(r-left-1>end-start+1){
                end = r-1;
                start = left+1;
            }
        }

        for(int i=0;i<len;i++){
            int l = i;
            int r = i+1;
            while(l>=0 && r<len && chars[l]==chars[r]){
                l--;
                r++;
            }
            if(r-l-1>end-start+1){
                start = l+1;
                end = r-1;
            }
        }return s.substring(start,end+1);
    }
}
//本题核心: 以当前只为回文串中心或当前值和其下一值为回文串中心进行判断。本解法未使用动态规划
