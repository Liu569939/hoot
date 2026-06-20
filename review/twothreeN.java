package review;

import java.util.Deque;
import java.util.LinkedList;

public class twothreeN {
    //239 滑动窗口最大值
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int [] ans = new int [len-k+1];
        Deque <Integer> deque = new ArrayDeque<>();
        for(int i =0;i<len;i++){
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }deque.offer(i);
            int l  = i-k+1;
            if(l<0) continue;
            if(deque.peekFirst()<l) deque.pollFirst();
            ans[l]=nums[deque.peekFirst()];
        }return ans;
    }
}
