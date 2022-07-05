class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 ) return 0;
        HashSet<Integer> set = new HashSet();
        for(int x: nums){
            set.add(x);
        }
        int curr =1, max = 0;
        for(int x: set){
            // Run the consecutive number look only for the smallest numbers in a consecutive sequence
            if(!set.contains(x-1)){
                int cNum = x;
                curr =1;
                while(set.contains(cNum+1)){
                    curr++;
                    cNum++;
                }
                max = Math.max(curr,max);
            }
        }
        return max;
    }
}
