package test;

public class hoottwoeightthree {
    public void moveZeroes(int [] nums){
        int left = 0;
        for(int r= 0 ;r<nums.length;r++){
            if(nums[r]!=0){
                int temp = nums[left];
                nums[left] = nums[r];
                nums[r] =temp;
                left++;
            }
        }
    }
    public void moveZeroer2(int [] nums){
        int idx = 0,len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i]!=0){
                nums[idx++] = nums[i];
            }
        }
        while(idx<len){
            nums[idx++] = 0;
        }
    }
}
//hoot283 移动零
//值得注意的是我们可以先遍历数组，将非零值取出，后续不足则补零处理
//题目要求非零数顺序不变所以不能使用排序，注意双指针 int i ,idx的利用

