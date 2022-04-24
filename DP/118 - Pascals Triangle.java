class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<>();
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ans.add(ls);
        List<Integer> prev = ls;
        for(int i=1;i< numRows;i++){
            List<Integer> tmp = new LinkedList<>();
            tmp.add(1);
            for(int j=1;j<i;j++){
                tmp.add(prev.get(j-1) + prev.get(j));
            }
            tmp.add(1);
            prev = tmp;
            ans.add(tmp);
        }
        return ans;
    }
}