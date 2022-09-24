class Solution {
    
    class Pair{
        int first;
        int second;
        int time;
        Pair(){}
        Pair(int f, int s, int t){
            first = f;
            second = s;
            time = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList();
        int m = grid.length, n = grid[0].length;
        int[][] visited = new int[m][n];
        for(int i=0;i< m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 2){
                    visited[i][j] = 2;
                    q.offer(new Pair(i,j,0));
                }
            }
        }
        int ans =0;
        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            int t = q.peek().time;
            q.poll();
            ans = Math.max(ans, t);
            int[] dcol = new int[]{0, 1, 0, -1};
            int[] drow = new int[]{-1, 0 , 1, 0};
            for(int i=0;i< 4;i++){
                int nrow = r+ drow[i];
                int ncol = c + dcol[i];
                if(nrow >= 0 && nrow < m && ncol >=0 && ncol <n && visited[nrow][ncol] == 0 && grid[nrow][ncol] == 1){
                    q.add(new Pair(nrow, ncol, t+1));
                    visited[nrow][ncol] = 2;
                  
                }
            }
            
            
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j] !=2 && grid[i][j] == 1) return -1;
            }
        }
        
        
       return ans; 
        
    }
}