public class sixeightC {
    //hoot 155最小栈
    class MinStack {
        private record  Pair(int value,int minStack){};
        Stack <Pair> stack = new Stack<>();
        public MinStack() {
            stack.push(new Pair(-1,Integer.MAX_VALUE));
        }


        public void push(int value) {
            if(value<stack.peek().minStack){
                stack.push(new Pair(value,value));
            }else {
                stack.push(new Pair(value,stack.peek().minStack));
            }
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return   stack.peek().value;
        }

        public int getMin() {
            return   stack.peek().minStack;
        }
    }
}
//本题核心: 是维护一个Pair的数组，每次元素入栈时比较元素值与当前栈中最小值（此前有一题类似）
