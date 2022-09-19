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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ls = new LinkedList();
        StringBuilder sb = new StringBuilder();
        recur(root, ls, sb);
        return ls;
        
    }
    
    public void recur(TreeNode node, List<String> ls, StringBuilder sb){
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null){
                    ls.add(sb.toString());
                    return;
        }
        sb.append("->"+node.val);
        recur(node.left, ls,new StringBuilder(sb));
        recur(node.right, ls, new StringBuilder(sb));


    }
}
