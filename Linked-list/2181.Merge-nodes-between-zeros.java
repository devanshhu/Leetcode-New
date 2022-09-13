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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next, ptr = head.next, result = head;
        int sum =0;
        while(curr != null){
            sum =0;
            while(curr != null){
                if(curr.val == 0) break;
                sum += curr.val;
                curr = curr.next;
            }
            ptr.val = sum;
            ptr.next = curr.next;
            ptr = ptr.next;
            curr = curr.next;
        }
        return result.next;
    }
}
