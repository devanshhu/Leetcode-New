class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max =0;
        for(int i=0;i< grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1)
                    max = Math.max(floodFill(grid,i,j), max);
            }
        }
        return max;
    }
    
    public int floodFill(int[][] grid, int i ,int j){
       if(valid(grid,i,j)){
           grid[i][j] = 0;
           return 1 + floodFill(grid,i+1,j)+ floodFill(grid,i,j+1)+ floodFill(grid,i-1,j)+ floodFill(grid,i,j-1);
       }
        return 0;
    }
    
    public boolean valid(int[][] grid, int i, int j){
        if(i >=0 && i < grid.length && j >=0 && j < grid[0].length && grid[i][j] == 1 )
            return true;
        return false;
    }
}


