 public class sixeight {
    //hoot 239 滑动窗口最大值
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int [] maxLen = new int  [len-k+1];
        Deque <Integer> deque = new LinkedList<>();
        for(int i =0;i<len;i++){
            while(!deque.isEmpty()&&nums[i]>=nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offer(i);
            int l = i-k+1;
            if(l<0) continue;
            if(deque.peekFirst()<l) deque.pollFirst();
            maxLen[l] = nums[deque.peek()];
        }return maxLen;
    }
}
//本题核心：维护一个单调队列，队首始终是当前窗口的最大值
 //当窗口未初始化时，完成初始化
 //当数组当前值大于队尾时，队尾出队，当前值加入队尾
 //当队首元素索引小于左侧边界时，队首出队
