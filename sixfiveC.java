public class sixfiveC {
    //hoot 74 搜索二维矩阵
    public boolean searchMatrix(int[][] matrix, int target) {
        int index  = 0;
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        if(target<matrix[0][0]||target>matrix[m][n]){return false;}
        while(index<m&&target>=matrix[index+1][0]){

            index++;}

        int [] nums = matrix[index];
        int left = 0;
        int right = n;
        while(left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]){return true;}
            else if(target>nums[mid]){left = mid+1;}
            else{right = mid-1;}
        }
        return false;
    }
}
//本题的核心：先while循环找到可能的数组（利用每行首元素递增的特性），注意区分二维数组只有单行的情况边界条件
//在利用二分查找判断是否可能存在target
