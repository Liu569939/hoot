import java.util.ArrayDeque;
import java.util.Deque;

public class sixfour {
    //hoot 394 字符串解码
    private record Pair(int n ,String s){}
    public String decodeString(String s) {
        int  n = 0 ;
        StringBuilder str = new StringBuilder();
     Deque<Pair> stack = new ArrayDeque<>();
        for(char c :s.toCharArray()){
            if(Character.isDigit(c)){
                n = n*10+(c-'0');
            }else if(Character.isLetter(c)){
                str.append(c);
            }else if(c == '['){
                stack.push(new  Pair(n,str.toString()));
                n = 0 ;
                str.setLength(0);
            }else{
                Pair p = stack.pop();
                str = new StringBuilder(p.s).repeat(str,p.n);
            }
        }return str.toString();
    }
}
//本题核心思路  通过遍历字符串若为数字则通过计算n存储
//若为字母则将字母存储数组pair中
//若为左括号表示n和str入栈，同时更新n和str
//若为右括号则将栈顶数组取出
//Deque是多线程不安全的，可以在算法演算时使用，多线程开发时使用stack或linkedDeque;
