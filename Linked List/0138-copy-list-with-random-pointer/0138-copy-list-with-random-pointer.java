/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // using extra space
        // HashMap<Node, Node> map = new HashMap<>();
        // Node curr = head;
        // while(curr != null){
        //     map.put(curr, new Node(curr.val));
        //     curr = curr.next;
        // }

        // curr = head;

        // while(curr != null){
        //     map.get(curr).next = map.get(curr.next);
        //     map.get(curr).random = map.get(curr.random);
        //     curr = curr.next;
        // }

        // return map.get(head);

        // without using extra space

        // creating new nodes and keeping them with the original nodes in the list
        Node iter = head;
        while(iter != null){
            Node newNode = new Node(iter.val);
            newNode.next = iter.next;
            iter.next = newNode;
            iter = iter.next.next;
        }

        iter = head;
        while(iter != null){
            if(iter.random != null){
                // joining new node's random to the actual random
                iter.next.random = iter.random.next;
            }

            iter = iter.next.next;
        }

        Node dummy = new Node(0);
        Node temp = dummy;
        Node actual = head;
        iter = head;
        
        while(iter != null){
            actual = iter.next.next;
            temp.next = iter.next;
            iter.next = actual;
            temp = temp.next;
            iter = actual;
        }

        return dummy.next;
    }
}