// the insert and remove methods will handle adding values to both list and map
class LRUCache {
    // variable to store the current capacity
    private int capacity;
    // map to store key-value pairs
    private HashMap<Integer, Node> map;
    // nodes to store the LRU cache
    Node head, tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            // update the key as recently used
            // step 1: remove the node from the list
            // step 2: insert the node in the front
            remove(node);
            insert(node);
            
            return node.val;
        } else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            // if the cache already contains the key, remove the current occurence
            remove(map.get(key));
        }
        
        if(capacity == map.size()){
            remove(tail.prev);
        }
        
        insert(new Node(key, value));
    }
    
    // method to insert a new key in the cache
    private void insert(Node node){
        map.put(node.key, node);
        Node head_next = head.next;
        head.next = node;
        node.prev = head;
        node.next = head_next;
        head_next.prev = node;
    }
    
    // method to remove the LRU node from the cache
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // class for doubly linked list
    private class Node{
        int key, val;
        Node prev, next;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */