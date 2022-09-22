class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1;i<n;i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}

// Further optimised
class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int[] dp = new int[n];
        int local = nums[0];
        int max = local;
        for(int i=1;i<n;i++){
            local = nums[i] + (local > 0 ? local : 0);
            max = Math.max(local,max);
        }
        return max;
    }
}

// Final implementation

class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        int local = nums[0];
        int max = local;
        for(int i=1;i<n;i++){
            local =  Math.max(local+nums[i],nums[i]);
            max = Math.max(local,max);
        }
        return max;
    }
}