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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode revNode = rev(slow);
        while(revNode != null ){
            if(revNode.val != head.val) return false;
            revNode = revNode.next;
            head = head.next;
        }
        return true;
        
    }
    
    public ListNode rev(ListNode node){
        ListNode fHead = new ListNode(-1, node);
        ListNode curr = node, prev = null,next= null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
