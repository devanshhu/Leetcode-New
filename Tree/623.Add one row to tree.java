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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val,root, null );
            return newRoot;
        }
        int currDepth =1;
        dfs(root, currDepth, val, depth);
        return root;
    }
    
    void dfs(TreeNode root, int currDepth, int val, int depth){
        if(root == null) return;
        if(currDepth+1 == depth){
            TreeNode leftRoot = new TreeNode(val, root== null ? null : root.left, null);
            TreeNode rightRoot = new TreeNode(val, null, root == null ? null : root.right);
            root.left = leftRoot;
            root.right = rightRoot;
            return;
        }
        dfs(root.left, currDepth+1, val, depth);
        dfs(root.right, currDepth+1, val, depth);
    }
}
