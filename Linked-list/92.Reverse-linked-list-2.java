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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode fHead = new ListNode(-1, head);
        ListNode leftPrev = fHead, curr = fHead;
        
      while(left--  > 0){
            leftPrev = curr;
            curr = curr.next;
            right--;
        }
        ListNode prev = null;
        while( right-- >= 0){
            ListNode tmp = curr.next ;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        
        leftPrev.next.next = curr;
        leftPrev.next = prev;
        return fHead.next;
    }
}
