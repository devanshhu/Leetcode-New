// Top Down:  Recursive + Memoized
class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m][n];
        for(int[] x: dp) Arrays.fill(x,-1);
        return lcs(a,b,m-1,n-1,dp);       
    }
    
    public int lcs(String a, String b, int i, int j, int[][] dp){
        if(i < 0 || j< 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return 1 + lcs(a,b,i-1,j-1,dp);
        return dp[i][j]=Math.max(lcs(a,b,i-1,j,dp), lcs(a,b,i,j-1,dp));
    }
}

// Bottom-Up

class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1) == b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
