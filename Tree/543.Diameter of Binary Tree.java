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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int[] result = new int[1];
        helper(root, result);
        return result[0];
    }
    
    public int helper(TreeNode node, int[] result){
       if(node == null) return 0;
        int lh = helper(node.left, result);
        int rh = helper(node.right, result);
        result[0] = Math.max(result[0], lh+rh);
        return 1+ Math.max(lh, rh);
        
    }
    
    
}
