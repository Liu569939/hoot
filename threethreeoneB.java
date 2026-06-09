public class threethreeoneB {
    public static void main(String[] args) {

    }
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit=0;
            int minPrice=Integer.MAX_VALUE;; //历史最低价
            for(int i=0;i<prices.length;i++){
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
                minPrice=Math.min(minPrice,prices[i]);
            }
            return maxProfit;
        }
    }
}
