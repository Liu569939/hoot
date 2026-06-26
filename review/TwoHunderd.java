package review;

public class TwoHunderd {
    //hoot 200 岛屿数量
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
                if(grid[i][j]=='1'){
                    numIslands(grid,i,j,rows,cols);
                    count++;
                }
            }
        }return count;
    }
    void numIslands(char[][] grid,int row,int col,int rows,int cols){
        grid[row][col] = '2';
        int top = row;
        if(top!=0&&grid[top-1][col]=='1')  numIslands(grid,top-1,col,rows,cols);
        if(top!=rows-1&&grid[top+1][col]=='1')  numIslands(grid,top+1,col,rows,cols);
        if(col!=cols-1&& grid[top][col+1] == '1')  numIslands(grid,top,col+1,rows,cols);
        if(col!=0 && grid[top][col-1] == '1') numIslands(grid,top,col-1,rows,cols);
    }
}
