package review;

public class OneTwentyEight {
    //hoot 128. 最长连续序列
    public int longestConsecutive(int [] nums){
        int len = nums.length;
        if(len==0||len ==1){return len;}
        Arrays.sort(nums);
        int curr = 1;
        int maxlen = 1;
        for(int i =1;i<len;i++){
            if(nums[i] == nums[i-1]) {continue;}
            else if(nums[i] == nums[i-1]+1){
                curr++;
            }else{
                maxlen = Math.max(maxlen,curr);
                curr =1;
            }
            maxlen = Math.max(maxlen,curr);
        }return maxlen;
}
