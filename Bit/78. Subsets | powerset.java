//Bit Approach:

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int n = nums.length;
        List<Integer> list;
        for(int num=0; num < (1<<n);num++){
            list = new LinkedList();
            for(int bit = 0; bit < n;bit++){
                if( (num & (1<<bit)) != 0 ){
                    list.add(nums[bit]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
    

}
//Backtracking Approach:

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        getAns(nums,ans,new ArrayList(),0);
        return ans;
    }
    
    public void getAns(int[] nums,List<List<Integer>> ans, List<Integer> list, int index ){
        ans.add(new ArrayList(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            getAns(nums,ans,list,i+1);
            list.remove(list.size()-1);
        }
    }
}
