public class sixtreeB {
    //hoot 20 有效的括号
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        Stack <Character> stack =  new Stack<>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){return false;}
                if(map.get(stack.pop())!=c){return false;}
            }
        }return stack.isEmpty();
    }
}
//题解:利用map函数构建左右括号的关系，然后利用栈进行匹配
//栈为空放入左括号直接返回无法匹配；栈非空且栈顶为左括号且匹配则弹出栈顶元素，否则返回false
//可以采用char [] 存储字符串，然后进行匹配(这样快一些）
