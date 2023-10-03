// 90 out of 95 test cases passed
// Not ideal because I am also using 3 similar data structures instead of a single one
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack_b = new Stack<>();
        Stack<Character> stack_c = new Stack<>();
        Stack<Character> stack_d = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack_b.push('(');
            } else if (c == '[') {
                stack_c.push('[');
            } else if (c == '{') {
                stack_d.push('{');
            } else if (c == ')') {
                if (stack_b.isEmpty() || stack_b.pop() != '(') {
                    return false;
                }
            } else if (c == ']') {
                if (stack_c.isEmpty() || stack_c.pop() != '[') {
                    return false;
                }
            } else if (c == '}') {
                if (stack_d.isEmpty() || stack_d.pop() != '{') {
                    return false;
                }
            } 
        }

        if (stack_b.isEmpty() && stack_c.isEmpty() && stack_d.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
