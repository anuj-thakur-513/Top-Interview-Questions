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
    public ListNode partition(ListNode head, int x) {

        // tempLesser and tempGreater are the two pointers used to create the two list
        // lesserList and greaterList are used to save the heads of the two lists.
        // All of these are initialized with the dummy nodes created.
        ListNode lesserList = new ListNode(-1);
        ListNode tempLesser = lesserList;
        ListNode greaterList = new ListNode(-1);
        ListNode tempGreater = greaterList;

        ListNode temp = head;

        while (temp != null) {

            // If the original list node is lesser than the given x,
            // assign it to the tempLesser list.
            if (temp.val < x) {
                tempLesser.next = temp;
                tempLesser = tempLesser.next;
            } else {
                // If the original list node is greater or equal to the given x,
                // assign it to the tempGreater list.
                tempGreater.next = temp;
                tempGreater = tempGreater.next;
            }

            // move ahead in the original list
            temp = temp.next;
        }

        // Last node of "tempGreater" list would also be ending node of the reformed list
        tempGreater.next = null;

        // Once all the nodes are correctly assigned to the two lists,
        // combine them to form a single list which would be returned.
        tempLesser.next = greaterList.next;

        return lesserList.next;
    }
}