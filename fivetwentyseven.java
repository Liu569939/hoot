public class fivetwentyseven {
    //hoot 152 乘积最大子数组
    public int maxProduct(int[] nums) {
        int max = nums[0] ,min = nums[0],maxans = nums[0];
        for(int i =1;i<nums.length;i++){
            int mm = max,mn = min;
            max = Math.max(mm*nums[i],Math.max(nums[i],mn*nums[i]));
            min = Math.min(mm*nums[i],Math.min(nums[i],mn*nums[i]));
            maxans = Math.max(maxans,max);
        }
        return maxans;
    }
}
//注意事项
//Math函数仅能接收两个int 类型的数据
//需要维护两个数组/字段，用于记录在索引 i下的最大值和最小值，而非出现 正负交替时重新筛选新的值  ，因为存在负数逆袭
