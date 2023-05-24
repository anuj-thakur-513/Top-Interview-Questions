class Solution {
    public int calculate(String s) {
        // Initialize a stack to store the operators and operands
        Stack<Integer> stack = new Stack<>();
        // Initialize variables to store the current number, sign and result
        int num = 0;
        int sign = 1;
        int result = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If the current character is a digit, update the current number
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '+') {
                // If the current character is '+', update the result with the current number and sign, and reset the current number and sign
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                // If the current character is '-', update the result with the current number and sign, and reset the current number and sign
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                // If the current character is '(', push the current result and sign onto the stack and reset them
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                // If the current character is ')', update the result with the current number and sign, pop the previous result and sign from the stack, and update the result
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        // Update the final result with the last number
        if (num != 0) {
            result += sign * num;
        }

        return result;
    }
}
