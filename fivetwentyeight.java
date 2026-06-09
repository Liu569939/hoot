public class fivetwentyeight {
    //hoot 75 颜色分类
    public void sortColors(int[] nums) {
        int left =0,curr =0, right = nums.length-1;
        while(curr<=right){
            int temp  = nums[curr];
            if(temp == 1){
                curr++;
            }else if(temp == 0){
                nums[curr] = nums[left];
                nums[left] = temp;
                curr++;left++;
            }else{
                nums[curr] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
}
//暴力解法：先遍历数组中0，1，2个数后修改数组
//有效解法：维护三个指针，实现
//right 右侧均为2
//left 左侧均为0
//curr 遍历指针
//left-curr 为1
//curr-right为带判断

