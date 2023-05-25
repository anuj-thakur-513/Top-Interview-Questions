/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // simply use Floyd's hare and tortoise algo
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast != null){
                // here match the nodes not the node's value (because two nodes can have same value)
                if(fast == slow){
                    return true;
                }
            }
        }
        
        return false;
    }
}