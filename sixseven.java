public class sixseven {
    //hoot 42 接雨水
    public int trap(int[] height) {
        int l  =0;
        int r = height.length-1;
        if(r<2){return}
        int lower = -1;
        int   waterLine = 0;
        int sum =0;
        while(l<r){
            if(height[l]<=height[r]){
                lower = height [l];
                l++;
            }else{
                lower = height[r];
                r--;
            }
            waterLine = Math.max(lower,waterLine);
            sum += waterLine - lower;
        }
        return sum;
    }
}
//本题核心:利用左右指针和盛最多谁的容器类似，当容器只需维护一个最大值，该题需要额外维护一个最矮柱中最大值，
//用于计算当前索引处积水量。左右指针不是难点，如何确定最矮柱中最大值是难点。
