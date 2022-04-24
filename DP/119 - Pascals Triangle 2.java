class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new LinkedList<>();
        List<Integer> prev = new LinkedList();
        ans.add(1);
        int i=1;
        while( i <= rowIndex){
            ans = new LinkedList();
            ans.add(1);
            for(int j=1;j< i;j++){
                ans.add(prev.get(j) + prev.get(j-1));
            }
            ans.add(1);
            prev = ans;
            
            i++;
        }
        return ans;
    }
}