public class sixfourC {
    //hoot 84 柱状图中最大的矩形
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        int length = heights.length;
        int [] arr = new int [length+2];
        for(int i = 1;i<=length;i++){
            arr[i] = heights[i-1];
        }
        stack.push(0);
        for(int i = 1;i<arr.length;i++){
            while(arr[i]<arr[stack.peek()]){
                int  height = arr[stack.pop()];
                int  width  = i - stack.peek() - 1;
                int  area  = width*height;
                maxArea = Math.max(maxArea,area);
            }stack.push(i);
        }return maxArea;
    }
}
//核心思路:和每日温度类似，构建一个单调栈，若当前值和栈顶元素满足关系则进行判断
//但是该题需要长和宽两个参数，而每日温度仅需记录索引即可，该题需要维护左右两个哨兵

