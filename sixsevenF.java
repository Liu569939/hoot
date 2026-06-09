public class sixsevenF {
    //hoot 1143 最长公共子序列
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        char[] cha1 = text1.toCharArray();
        char[] cha2 = text2.toCharArray();
        int[] dp = new int[len2 + 1];
        for (int i = 1; i <= len1; i++) {
            int pre = 0;
            for (int j = 1; j <= len2; j++) {
                int temp = dp[j];
                if (cha1[i - 1] == cha2[j - 1]) {
                    dp[j] = pre + 1;

                } else {
                    // 情况2：字符不等，取上方或左方的最大值
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                pre = temp;
            }

        }
        return dp[len2];
    }
}
//本题有点难，不做题解，下次请重新思考
