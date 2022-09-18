class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> pq = new LinkedList();
        pq.add(root);
        boolean flag = false;
        while(!pq.isEmpty()){
            int size = pq.size();
            TreeNode[] arr = new TreeNode[size];
            for(int i=0;i< size;i++){
                TreeNode node = pq.remove();
                arr[i] = node;
                if(node.left != null) {
                    pq.add(node.left);
                    pq.add(node.right);
                }
            }
            if(flag){
                int left = 0, right = arr.length-1;
                while(left < right){
                    int tmp = arr[left].val;
                    arr[left].val = arr[right].val;
                    arr[right].val = tmp;
                    left++; right--;
                }
            }
            flag = !flag;
        }
        return root;
        
    }
   
}