public class sixthree {
    //994腐烂的橘子
    private static final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int row = grid.length;
        int top = grid[0].length;
        List<int [] > list = new ArrayList<>();
        int  count = 0;
        for(int i = 0;i<row;i++){
            for(int j =0;j<top;j++){
                if(grid[i][j] ==1){fresh++;}
                else if(grid[i][j]==2) {list.add(new int []{i,j});}
            }
        }
        while(fresh >0&&!list.isEmpty()){
            count++;
            List<int [] > temp =list;
            list = new ArrayList<>();

            for (int[] pos : temp) { // 已经腐烂的橘子
                for (int[] d : DIRECTIONS) { // 四方向
                    int i = pos[0] + d[0];
                    int j = pos[1] + d[1];
                    if (0 <= i && i < row && 0 <= j && j < top && grid[i][j] == 1) { // 新鲜橘子
                        fresh--;
                        grid[i][j] = 2; // 变成腐烂橘子
                        list.add(new int[]{i, j});
                    }
                }
            }

        }
        return fresh>0?-1:count;

    }
}
//先遍历二维数组统计新鲜橘子数量和坏橘位置，利用记录的坏橘位置进行下一分钟的腐烂扩散，
// 每次扩散更新坏橘集合（因为原有坏橘在本次扩散时，四周均被扩散），
// 若新鲜橘子数量为0表示所有橘子均腐烂，若坏橘集合为空表示所有坏橘的四周均扩散完毕。判断新鲜橘子数后返回结果即可
