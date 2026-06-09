public class sixNB {
    //hoot 238 除了自身以外数组的乘积
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] r= new int [len];
        int [] ans = new int [len];
        r[len-1]  = 1;
        int  l = 1;
        for(int i = len-2;i>=0;i--){
            r[i] = r[i+1]*nums[i+1];
        }
        for(int i =0;i<len;i++){
            ans[i] = l*r[i];
            l = l*nums[i];
        }return ans;
    }
}
//本题核心: 核心是维护两个数组l，r 。分别表示当前索引前侧数组元素乘积和后侧元素乘积
//优化思路: 前侧数组是连续的，可以优化为变量int， 空间复杂度为O(1)
//优化第二点: 后侧数组可以作为答案返回数组的基地，先计算后侧数组，在利用数组元素和变量int 遍历相乘后更新索引数值 nums*= l;
