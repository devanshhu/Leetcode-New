class Solution {
    int MOD = 1_000_000_007;
    public int numberOfWays(int startPos, int endPos, int k) {
        int[][] dp = new int[4010][k+1];
        for(int[] x: dp) Arrays.fill(x, -1);
        return helper(startPos+ 1000, endPos+1000, k,dp);
    }
    
    int helper( int index, int end , int k, int[][] dp){
        if(k == 0 ){
            if(index == end) return 1;
            return 0;
        }
        if(dp[index][k] != -1) return dp[index][k];
        return dp[index][k] = (helper(index +1, end,k-1,dp) + helper(index-1, end,k-1,dp))%MOD;
    }
}
