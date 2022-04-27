class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int[][] mat = new int[og.length][og[0].length];
        if(og[0][0] == 1) return 0;
        mat[0][0] = 1;
        for(int i=1;i< og[0].length;i++){
            mat[0][i] = og[0][i] == 1 ? 0 : mat[0][i-1];
        }
        for(int i=1 ; i < og.length;i++){
            mat[i][0] = og[i][0] == 1 ? 0 : mat[i-1][0];
        }
        for(int i=1;i< mat.length;i++){
            for(int j=1;j< mat[0].length;j++){
                mat[i][j] = og[i][j] == 1 ? 0 : mat[i-1][j]+ mat[i][j-1]; 
            }
        }
        return mat[mat.length-1][ mat[0].length - 1];
    }
}