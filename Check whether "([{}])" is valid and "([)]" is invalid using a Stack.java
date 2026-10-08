// Q17. Check whether "([{}])" is valid and "([)]" is invalid using a Stack.
import java.util.Stack;

public class ValidParentheses_Q17_Check_whether_is_valid_and_is_invalid_using_a_Stack {
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
        String a = "([{}])";
        String b = "([)]";
        System.out.println(a + " -> " + (isValid(a) ? "Valid" : "Invalid"));
        System.out.println(b + " -> " + (isValid(b) ? "Valid" : "Invalid"));
    }
}
