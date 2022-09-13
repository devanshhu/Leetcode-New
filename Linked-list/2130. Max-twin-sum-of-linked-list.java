/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    ListNode ref;
    public int pairSum(ListNode head) {
        ref = head;
        helper(head);
        return max;
    }
    
    void helper(ListNode node){
        if(node == null) return;
        helper(node.next);
        max = Math.max(max, node.val + ref.val);
        ref = ref.next;
    }
    
}
