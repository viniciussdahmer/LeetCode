// This solution uses a hashmap to keep tracking of all different possible characters
// that we are looking for, making it more scalable than using a lot of if and else if condiitons
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> mappings = new HashMap<>();
        mappings.put('(', ')');
        mappings.put('[', ']');
        mappings.put('{', '}');
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (mappings.containsKey(c)) {
                stack.push(c);
            } else if (mappings.containsValue(c)) {
                if (stack.isEmpty() || mappings.get(stack.pop()) != c) {
                    return false;
                }
            } 
        }

        return stack.isEmpty() ? true : false;
    }
}
