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
        if (head == null || head.next == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);  // Dummy node to handle the case when left = 1
        dummy.next = head;
        ListNode preStart = dummy;
        int i = 1;

        // Move preStart to the node before the left position
        while (i < left) {
            preStart = preStart.next;
            i++;
        }

        ListNode start = preStart.next;
        ListNode ptr = start.next;

        // Reverse the sublist from left to right
        while (i < right) {
            ListNode temp = ptr.next;
            ptr.next = preStart.next;
            preStart.next = ptr;
            start.next = temp;
            ptr = temp;
            i++;
        }

        return dummy.next;
    }
}
