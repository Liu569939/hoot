import java.util.Arrays;

public class fortwentytwoB {
    //hoot -169 多数元素
    public int majorityElement(int [] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
