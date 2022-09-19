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
    String ans;
    public String smallestFromLeaf(TreeNode root) {
        ans = "~";
        helper(root, new StringBuilder());
        return ans;
    }
    
    private void helper(TreeNode root, StringBuilder sb ){
        if(root == null) return ;
        sb.append((char)(root.val +'a'));
        if(root.left == null && root.right == null){
            sb.reverse();
            String tmp = sb.toString();
            sb.reverse();
            if(tmp.compareTo(ans) < 0)
                ans = tmp;
        }
        
        helper(root.left,sb);
        helper(root.right, sb);
        sb.setLength(sb.length()-1);
    }
}
