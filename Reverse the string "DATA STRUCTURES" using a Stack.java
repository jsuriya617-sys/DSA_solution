// Q3. Reverse the string "DATA STRUCTURES" using a Stack.
import java.util.Stack;

public class Stack_Q03_Reverse_the_string_DATA_STRUCTURES_using_a_Stack {
    public static void main(String[] args) {
        String text = "DATA STRUCTURES";
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        String reversed = "";
        while (!stack.isEmpty()) reversed += stack.pop();
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}
