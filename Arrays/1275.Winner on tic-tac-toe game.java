class Solution {
    int n =3;
    public String tictactoe(int[][] moves) {

    char[][] board = new char[n][n];
    for(int i=0;i<moves.length;i++){
        if((i&1) == 0){
            board[moves[i][0]][moves[i][1]] = 'A';
            if(check(board,moves[i][0], moves[i][1], 'A')) return "A";
        }else{
            board[moves[i][0]][moves[i][1]] = 'B';
            if(check(board,moves[i][0], moves[i][1],'B')) return "B";
        }
    }
    return moves.length == 9 ?"Draw" : "Pending";
        
    }
    
    public boolean check(char[][] board,int row, int col, char player){
        boolean won = true;
        for(int i = 0; i < n; i++){
            if(board[row][i] != player){
                won = false;
            }                
        }
        if(won) return true;   
        
        won = true;
        for(int i = 0; i < n; i++){
            if(board[i][col] != player){
                won = false;
            }                
        }
        if(won) return true;   
        
        if(row == col){
            won = true;
            for(int i = 0; i < n; i++){
                if(board[i][i] != player){
                    won = false;
                }                
            }
            if(won) return true;   
        }
        
        if(col == n - row - 1){
            won = true;
            for(int i = 0; i < n; i++){
                if(board[i][n-i-1] != player){
                    won = false;
                }                
            }
            if(won) return true;    
        }
        
        
        return false;
    }
    
}