class Solution {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[][] dp = new int[piles.size()+1][k+1];
        for(int[] x: dp) Arrays.fill(x, -1);
        return helper(piles, 0,k,dp);
    }
    
    public int helper(List<List<Integer>> piles, int index, int k,int[][] dp){
        if(k == 0 || index == piles.size()) return 0;
        if(dp[index][k] != -1) return dp[index][k];
            int ans = helper(piles, index+1,k,dp);
            int sum =0;

        for(int i=0;i<Math.min(k, piles.get(index).size());i++){
            sum += piles.get(index).get(i);
            ans = Math.max(ans, sum + helper(piles, index+1, k-i-1,dp));
            
        }
        return dp[index][k]=ans;
        
    }
}
