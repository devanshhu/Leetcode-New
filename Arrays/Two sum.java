class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        int i=0;
        for(int x: nums){
            if(hs.containsKey(target- x))
                return new int[]{hs.get(target-x), i};
            else
                hs.put(x,i);
                i++;
        }
        return new int[]{0,0};
    }
}
