class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1, n = nums.length;
        while( l < r){
            int mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > nums[r]) l = mid+1;
            else
                r= mid;
        }
        int start = l;
        if(target >= nums[start] && target <= nums[nums.length-1] ){
            l = start;
            r = nums.length-1;
        }else{
            l = 0;
            r = start;
        }
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;   
            }
            if(nums[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return -1;
        
    }
}
