import java.util.HashMap;
import java.util.Map;

public class ttoC {
    public int maxSubArray(int[] nums) {

      int max=nums[0],sum=nums[0];

      for (int i =1;i<nums.length;i++){
          max = Math.max(max+i,i);
          sum =Math.max(sum,max);
      }
      return sum;

    }
}
