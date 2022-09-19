/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isCousins(TreeNode root, int x, int y) {
    
       Queue<TreeNode> q = new LinkedList();
        q.add(root);
        TreeNode xp = null, yp = null;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size ; i++ ){
                TreeNode node = q.remove();
                if(node.left != null){
                    q.add(node.left);
                    if(node.left.val == x) xp = node;
                    if(node.left.val == y) yp = node;
                }
                if(node.right != null){
                    q.add(node.right);
                    if(node.right.val == x) xp = node;
                    if(node.right.val == y) yp = node;
                }
            }
            if((xp == null && yp != null) || (xp != null && yp == null)) return false;
        }
        return xp != yp;
        
        
    }
    
}
