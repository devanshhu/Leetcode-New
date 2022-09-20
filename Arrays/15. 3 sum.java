class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1, k = nums.length-1;
            while(j < k){
                int sum = nums[i]+ nums[j]+ nums[k];                
                if(sum == 0 ) res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                if( sum < 0 ) j++;
                if( sum > 0) k--;
            
            }

            
            
        }
        return new ArrayList<>(res);
    }
}
