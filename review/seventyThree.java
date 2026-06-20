package review;

public class seventyThree {
    //hoot 73. 矩阵置零
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean [] nboolean = new boolean [n];
        boolean [] mboolean = new boolean [m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(matrix[i][j]==0){
                    nboolean[i] = true;
                    mboolean[j] = true;
                }
            }
        }for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(nboolean[i]|| mboolean[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
