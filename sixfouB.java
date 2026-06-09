public class sixfouB {
    //hoot 739 每日温度
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int [] ansarr = new int  [length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i =0;i<length;i++){
            while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                int j = stack.pop();
                ansarr[j] = i-j;
            }stack.push(i);
        }
        return ansarr;

    }
}
//核心思路:遍历当前元素时，
// 如果栈不为空且当前元素大于栈顶元素，当前元素和栈顶元素的距离即栈顶元素的记录值
// 若当前元素小于栈顶元素则正常入栈
//核心时判断当前元素是否大于栈顶元素，大于则出栈，并记录当前元素和栈顶元素的距离
