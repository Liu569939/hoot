public class sixfouD {
    //hoot 合并数组
    class Solution {
        public int[][] merge(int[][] intervals) {
            if(intervals.length<2){return intervals;}
            Arrays.sort(intervals, new Comparator<int[]>() {
                public int compare (int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });
            List< int []> retList = new ArrayList<>();
            int numleft = intervals[0][0];
            int numright = intervals[0][1];
            for(int i = 1;i<intervals.length;i++){
                int preleft = intervals[i][0];
                int preright = intervals[i][1];
                if(preleft<=numright){
                    if(preright>numright){
                        numright = preright;
                    }
                }else{
                    retList.add(new int []{numleft,numright});
                    numleft = preleft;
                    numright = preright;
                }

            }
            retList.add(new int  [] {numleft,numright});
            return retList.toArray(new int [retList.size()][]);
        }
    }
}
//核心思路: 先将二维数组按左侧元素进行排序，然后进行遍历，如果当前元素左侧元素小于等于前一个元素右侧元素，则将右侧元素进行更新，否则将当前元素加入结果集，并更新左侧元素和右侧元素。
//注意直接使用 int i  = intervals[3][7] 会更快
