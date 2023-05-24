class Solution {
    public String simplifyPath(String path) {
        // Create a stack to keep track of the directories in the path
        Stack<String> stack = new Stack<>();
        
        // Split the input path by '/'
        String[] parts = path.split("/");
        
        // Process each part
        for (String part : parts) {
            // If the part is empty or '.', do nothing
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }
            // If the part is '..', pop the top element from the stack if it's not empty
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, push the part into the stack
                stack.push(part);
            }
        }
        
        // Construct the simplified canonical path by joining the elements in the stack with '/'
        return "/" + String.join("/", stack);
    }
}