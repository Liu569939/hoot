package review;

public class fiftyfour {
    //hoot 54 螺旋矩阵
    public List<Integer> spiralOrder(int[][] matrix) {

        int left = 0;
        int row  = 0;
        int right = matrix[0].length-1;
        int col   = matrix.length-1;
        List<Integer> ans = new ArrayList<>();
        while(row<=col&&left<=right){
            for(int i = left;i<=right;i++){
                ans.add(matrix[row][i]);
            }row++;
            for(int j = row;j<=col;j++ ){
                ans.add(matrix[j][right]);
            }right--;
            if(col>=row&&left<=right){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[col][i]);
                }col--;
                for(int j =col;j>=row;j--){
                    ans.add(matrix[j][left]);
                }left++;
            }
        }return ans;

    }
}
