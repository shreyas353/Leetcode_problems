class Solution {
    public boolean isValid(String s) {
        // Use a character array to simulate stack
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack[++top] = ch; // Push to "stack"
            } else {
                if (top == -1) return false; // Stack is empty

                char topChar = stack[top--]; // Pop from "stack"

                if ((ch == ')' && topChar != '(') ||
                    (ch == ']' && topChar != '[') ||
                    (ch == '}' && topChar != '{')) {
                    return false;
                }
            }
        }
        return top == -1; // If stack is empty, it's valid
    }
}
