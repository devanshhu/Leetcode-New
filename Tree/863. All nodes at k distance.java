/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> map;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        map = new HashMap();
        // map.put(root, null);
        populateMap(root,null, map);
        List<Integer> list = new ArrayList();
        boolean[] visited = new boolean[501];
        Queue<TreeNode> q = new LinkedList();
        q.add(target);
        while(!q.isEmpty() ){
            if(k == 0) break;
            int size = q.size();
            for(int i=0;i< size;i++){
                TreeNode node = q.remove();
                visited[node.val] = true;
                if(node.left != null && !visited[node.left.val]){
                    q.add(node.left);
                    visited[node.left.val] = true;
                }
                if(node.right != null && !visited[node.right.val]){
                    q.add(node.right);
                    visited[node.right.val] = true;


                }
                if(map.get(node) != null && !visited[map.get(node).val] ){
                    q.add(map.get(node));
                    visited[map.get(node).val] = true;
                }
            }
            k--;
        }
        List<Integer> result = new ArrayList();
        while(!q.isEmpty())
            result.add(q.poll().val);
        return result;
    }
    
    public void populateMap(TreeNode node, TreeNode parent, Map<TreeNode , TreeNode> map){
        if(node == null) return;
        map.put(node, parent);
        populateMap(node.left, node, map);
        populateMap(node.right, node, map);
        
    }
}
