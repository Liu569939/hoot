package review;

public class NineHunderdNinetyFor {
    //hoot 994 腐烂的橘子
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int fresh  = 0;
        List<int [] > list = new ArrayList<>();
        for(int i =0;i<rows;i++){
            for(int j = 0;j<cols;j++){

                if(grid[i][j]==2){list.add(new int[] {i,j});}
                else if(grid[i][j]==1){fresh++;}
            }
        }
        int count=0;
        while(!list.isEmpty()&&fresh!=0){
            count++;
            List<int[] > temp  =  list;
            list = new ArrayList<>();
            for(int [] curr : temp){
                for(int [] Dir :DIRECTIONS){
                    int i  = curr[0]+Dir[0];
                    int j  = curr[1]+Dir[1];
                    if( i>=0&& i<rows &&(j>=0&&j<cols)&&grid[i][j]==1){
                        fresh--;
                        grid[i][j] = 2;
                        list.add(new int []{i,j});
                    }
                }
            }
        }
        return fresh>0?-1:count;
}
