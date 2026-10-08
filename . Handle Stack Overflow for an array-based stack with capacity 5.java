// Q13. Handle Stack Overflow for an array-based stack with capacity 5.
public class PushPopPeek_Q13_Handle_Stack_Overflow_for_an_array_based_stack_with_capacity_5 {
    static int[] arr = new int[5]; // capacity 5
    static int top = -1;

    static void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow: cannot push " + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            push(i * 10);
        }
        System.out.print("Stack (bottom to top): ");
        for (int i = 0; i <= top; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
