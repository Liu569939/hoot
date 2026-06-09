public class sixC {
    //hoot 41 缺失的第一个正数
    public int firstMissingPositive(int[] nums) {
        int  len = nums.length;
        for(int i =0;i<len;i++){
            while(nums[i]>0&&nums[i]<=len&&nums[i]!=nums[nums[i]-1]){
                int temp = nums[i];
                nums[i]  = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        for(int i =0;i<len;i++){
            if(nums[i]!=i+1) return i+1;
        }return len+1;
    }
}
//本题核心：利用数组本身作为标记，将元素1移到至下标[0] 的位置，元素2移至下标1 的位置，元素3移至下标2的位置，以此类推
//值得注意的是当元素为负数或大于数组长度时，表示数组缺少对应正数，同时为了避免死循环 nums[i] ! = nums[nums[i]-1] 若nums [0] =3,nums[2] = 3 就会出现索引1和3死循环
// 将数组排列为一个有序的数组，然后遍历数组，如果当前元素不等于索引+1，则返回索引+1
