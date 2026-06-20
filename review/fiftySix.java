package review;

public class fiftySix {
    // hoot 56 合并区间
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if(len<2){return intervals;}
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0] -b[0];
            }
        });
        int numleft = intervals[0][0];
        int numright = intervals[0][1];
        for(int i =1;i<len;i++){
            int currleft = intervals[i][0];
            int currright = intervals[i][1];
            if(currleft<=numright){
                if(currright>numright){
                    numright = currright;
                }
            }else{
                ans.add(new int []{numleft,numright});
                numleft = currleft;
                numright = currright;
            }
        }ans.add(new int[] {numleft,numright});
        return ans.toArray(new int[ans.size()][]);
    }
}
