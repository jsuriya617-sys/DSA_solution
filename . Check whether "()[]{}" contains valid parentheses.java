// Q16. Check whether "()[]{}" contains valid parentheses.
import java.util.Stack;

public class ValidParentheses_Q16_Check_whether_contains_valid_parentheses {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(s + " -> " + (isValid(s) ? "Valid" : "Invalid"));
    }
}
