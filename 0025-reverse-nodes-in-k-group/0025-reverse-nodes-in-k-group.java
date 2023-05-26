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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
        int len = lengthOfLinkedList(head);
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr, nex;
        
        while(len >= k){
            curr = prev.next;
            nex = curr.next;
            
            for(int i = 1; i < k; i++){
                curr.next = nex.next;
                nex.next = prev.next;
                prev.next = nex;
                nex = curr.next;
            }
            prev = curr;
            len -= k;
        }
        
        return dummy.next;
    }
    
    // method to find the length of LL
    private int lengthOfLinkedList(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length += 1;
            temp = temp.next;
        }
        return length;
    }
}