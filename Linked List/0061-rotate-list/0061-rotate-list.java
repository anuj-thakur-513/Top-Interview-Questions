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
    // make the linked list circular and then break the link
    // from where it is needed
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        
     // calculate the length of the linked list
        int len = lengthOfLinkedList(head);
        k = k % len;
        
        ListNode temp = head;
        
        while(temp.next != null){
            temp = temp.next;
        }
        // making the list a circular linked list
        temp.next = head;
        
        k = len - k;
        
        ListNode start = head;
        
        for(int i = 1; i < k; i++){
            start = start.next;
        }
        
        head = start.next;
        start.next = null;
        return head;
    }
    
    private int lengthOfLinkedList(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        return len;
    }
}