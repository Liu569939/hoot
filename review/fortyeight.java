package review;

public class fortyeight {
    //48 旋转图像
    public void rotate(int[][] matrix) {
        int nlen = matrix.length-1;
        int index =nlen/2;
        for(int i =0;i<=nlen;i++){
            for(int j =0;j<i;j++){
                revese(matrix,i,j,j,i);
            }
        }
        for(int  i =0;i<=nlen;i++){
            for(int j = 0;j<=index;j++){
                revese(matrix,i,j,i,nlen-j);
            }
        }
    }
    void revese(int[][] matrix,int top1,int index1,int top2,int index2){
        int temp = matrix[top1][index1];
        matrix[top1][index1] = matrix[top2][index2];
        matrix[top2][index2] = temp;
    }
}
