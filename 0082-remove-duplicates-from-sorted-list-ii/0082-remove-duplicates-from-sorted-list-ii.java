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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy, curr = dummy.next;
        // this keeps track whether we encountered same valued nodes or not
        int count = 0;

        while(curr != null){
            while(curr.next != null && (curr.val == curr.next.val)){
                curr = curr.next;
                count++;
            }
            if(count > 0){
                // we encountered same valued nodes, so we skip all of them
                curr = curr.next;
                prev.next = curr;
                count = 0;
            } else{
                prev = curr;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}