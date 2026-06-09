public class fivetwentyeightB {
    //hoot 31下一个排列
    public void nextPermutation(int[] nums) {

        int n = nums.length - 2;
        // 查找较小数
        while (n >= 0 && nums[n] >= nums[n + 1]) {
            n--;
        }
        if (n >= 0) {
            int m = nums.length - 1;
            while (m >= 0 && nums[n] >= nums[m]) {
                m--;
            }
            swap(nums, n, m);
        }
        resverse(nums, n + 1);
    }

    public void swap(int[] nums, int n, int m) {
        int temp = nums[n];
        nums[n] = nums[m];
        nums[m] = temp;
    }

    public void resverse(int[] nums, int index) {
        if (index > nums.length) {
            return;
        }
        int right = nums.length - 1;
        while (index < right) {
            swap(nums, index, right);
            index++;
            right--;
        }
    }
}
//这题自己写出来了
