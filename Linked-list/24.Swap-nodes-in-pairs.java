// Check the below explanation:
// https://leetcode.com/problems/swap-nodes-in-pairs/discuss/1775033/SWAPPING-NODES-(Not-just-the-values)-oror-Visual-Explanation-oror-Well-Explained-oror-C%2B%2B
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1, head.next);
        ListNode curr = head, prev =dummy;
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            curr.next = prev.next.next;
            prev.next.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
