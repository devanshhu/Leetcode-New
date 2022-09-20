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
    int sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) return 0;
        helper(root, L,  R);
        return sum;
    }
    void helper(TreeNode node, int l, int r){
        if(node == null) return;
        if(node.val >= l && node.val <= r) sum+= node.val;
        helper(node.left, l, r);
        helper(node.right, l, r);
    }
}
