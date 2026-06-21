package review;

public class TwoHunderdForty {
    //hoot240 搜索二维矩阵II
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;
        while (j >= 0 && i <matrix.length) {
            if (matrix[i][j] > target)
                j--;
            else if (matrix[i][j] < target)
                i++;
            else {
                return true;
            }
        }
        return false;
    }
}
//本题核心：利用矩阵特性
// 每行的元素从左到右升序排列。
//每列的元素从上到下升序排列。
//从右上角开始搜索，如果当前元素大于目标值，则向左移动，如果当前元素小于目标值，则向下移动，如果当前元素等于目标值，则返回true，如果遍历完矩阵仍未找到目标值，则返回false。
//参考有序二叉树

