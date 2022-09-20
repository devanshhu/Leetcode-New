class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0, j = arr.length -1;
        while( i < j && i < arr.length && j >=0){
            if(arr[i] + arr[j] == target) return new int[]{i+1,j+1};
            if(arr[i] + arr[j] < target) i++;
            else
                j--;
        }
        
        
        return new int[]{0,0};
        
    }
}
