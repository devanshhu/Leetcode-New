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
    public ListNode swapNodes(ListNode head, int k) {
      int len =0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            len++;
        }
        int i=1;
        int swapIndex = len-k+1;
        curr = head;
        while(i != k){
            curr = curr.next;
            i++;
        }   
        i=1;
        ListNode swapNode = head;
        while(i != swapIndex){
            swapNode = swapNode.next;
            i++;
        }
        int tmp = curr.val;
        curr.val = swapNode.val;
        swapNode.val = tmp;
        return head;
    }
}
