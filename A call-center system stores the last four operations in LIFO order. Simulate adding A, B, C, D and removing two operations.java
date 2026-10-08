// Q12. Handle Stack Underflow when pop() or peek() is called on an empty stack.
public class PushPopPeek_Q12_Handle_Stack_Underflow_when_pop_or_peek_is_called_on_an_empty_stack {
    static int[] arr = new int[5];
    static int top = -1;

    static void push(int x) {
        arr[++top] = x;
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: cannot pop from an empty stack");
            return;
        }
        System.out.println("Popped: " + arr[top--]);
    }

    static void peek() {
        if (top == -1) {
            System.out.println("Stack Underflow: cannot peek an empty stack");
            return;
        }
        System.out.println("Top: " + arr[top]);
    }

    public static void main(String[] args) {
        pop();   // empty stack
        peek();  // empty stack
        push(10);
        peek();
        pop();
        pop();   // empty again
    }
}
