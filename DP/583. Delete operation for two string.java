class Solution {
    public int minDistance(String a, String b) {
        int m = a.length(), n = b.length();
       int[][] dp = new int[m+1][n+1];
        for(int i=1;i<= m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return m+n-2*dp[m][n];
    }
}
