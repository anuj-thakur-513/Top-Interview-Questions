/**
    As it is a postfix expression, so the approach that 
    comes to our mind is using stack
    
    [4, 13, 5, /, +] -> (4 + (13/5))
    
    keep pushing elements in the stack and whenever we get an
    operator, pop last two operands
    
    now solve the expression formed and then push the solution
    keep repeating till the end of the string array
**/


class Solution {
    public int evalRPN(String[] tokens) {
        // stack to operate the postfix
        Stack<Integer> stack = new Stack<>();
        
        for(String str : tokens){
            if(str.equals("+")){
                stack.push(stack.pop() + stack.pop());
            } else if(str.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            } else if(str.equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            } else if(str.equals("*")){
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        
        return stack.pop();
    }
}