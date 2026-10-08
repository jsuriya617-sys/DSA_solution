// Q2. A stack contains 10, 20, 30. Push 40, pop once, then peek. Write the final stack and top element.
import java.util.Stack;

public class Stack_Q02_A_stack_contains_10_20_30_Push_40_pop_once_then_peek_Write_the_final_stack_and_top_element {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Final stack (bottom to top): " + stack);
    }
}
