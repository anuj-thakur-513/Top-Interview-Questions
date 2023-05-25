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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a new LinkedList to store the answer
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int sum = 0;
        int carry = 0;

        // nodes for traversal in lists
        ListNode traversal1 = l1;
        ListNode traversal2 = l2;

        while(traversal1 != null || traversal2 != null || carry != 0) {
            if(traversal1 != null) {
                sum += traversal1.val;
                traversal1 = traversal1.next;
            }
            if(traversal2 != null) {
                sum += traversal2.val;
                traversal2 = traversal2.next;
            }

            sum += carry;

            carry = sum / 10;
            sum %= 10;

            ListNode node =  new ListNode(sum);
            temp.next = node;
            temp = temp.next;

            sum = 0;
        }

        return dummy.next;
    }
}