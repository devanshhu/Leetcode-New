class Solution {
    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        //Iterating all boundaries
        for(int i=0;i<n;i++){
            // Iterating first row to check if it contains an 'O'
            if(board[0][i] == 'O'){
                dfs(0,i,vis,board);
            }
            // Iterating last row to check if it contains an 'O'
            if(board[m-1][i] == 'O'){
                dfs(m-1,i, vis, board);
            }
        }
        
        for(int i=0;i<m;i++){
            // Iterating first column to check if it contains 'O'
            if(board[i][0] == 'O'){
                dfs(i,0,vis,board);
            }
            // Iterating last column to check if it contains 'O'
            if(board[i][n-1] == 'O'){
                dfs(i,n-1,vis,board);
            }
        }
        
        // Iterating to convert all remaining O to X
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            if(board[i][j] == 'O' && vis[i][j] == false){
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    void dfs(int row, int col, boolean[][] visited, char[][] board){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] =='X' || visited[row][col] == true ) return;
        visited[row][col] = true;       
        dfs(row-1, col, visited, board);
        dfs(row+1, col, visited, board);
        dfs(row, col-1, visited, board);
        dfs(row, col+1, visited, board);
    }
}
