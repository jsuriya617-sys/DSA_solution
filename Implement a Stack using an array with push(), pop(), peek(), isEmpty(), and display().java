// Q1. Implement a Stack using an array with push(), pop(), peek(), isEmpty(), and display().
public class Stack_Q01_Implement_a_Stack_using_an_array_with_push_pop_peek_isEmpty_and_display {
    static int[] arr = new int[10];
    static int top = -1;

    static boolean isEmpty() {
        return top == -1;
    }

    static void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    static int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();
        System.out.println("Popped: " + pop());
        System.out.println("Peek: " + peek());
        display();
    }
}
