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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        int[] result = new int[1];
        helper(root, result, 0);
        return result[0];
    }
    
    void helper(TreeNode node , int[] result, int num){
        if(node == null) return ;
        if(node.left == null && node.right == null){
            num = num * 10 + node.val;
            result[0] += num;
             return;
        }
        num = num*10 + node.val;
        helper(node.left, result, num);
        helper(node.right, result, num);
    }
}

// Other Short & Intuitive Solution

class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    
    int helper(TreeNode node ,  int num){
        if(node == null) return 0;
        if(node.left == null && node.right == null) return num * 10 + node.val;
        return helper(node.left, num * 10+ node.val) + helper(node.right, num* 10+ node.val);
    }
}
