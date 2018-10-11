import java.util.Stack;

public class Solution1 {
    public boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : array) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.empty()) {
                    char cur = stack.peek();
                    if ((cur == '(' && c == ')') || (cur == '[' && c == ']') || (cur == '{' && c == '}')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
