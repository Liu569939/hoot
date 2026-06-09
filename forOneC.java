import java.util.List;

public class forOneC {
    //hot - 189 轮转数组
    public void rotate(int[] matrix,int k) {
        int len = matrix.length;
        int [] newArr = new int [len];
        for(int i=0;i<len;++i){
            newArr[(i+k) %len]=matrix[i];
    }
        System.arraycopy(newArr,0,matrix,0,len);
    }
}
