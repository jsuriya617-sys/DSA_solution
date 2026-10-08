// Q18. Given "((a+b)*c)", determine whether all parentheses are balanced.
import java.util.Stack;

public class ValidParentheses_Q18_Given_a_b_c_determine_whether_all_parentheses_are_balanced {
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
        String s = "((a+b)*c)";
        System.out.println(s + " -> " + (isValid(s) ? "Balanced" : "Not balanced"));
    }
}
