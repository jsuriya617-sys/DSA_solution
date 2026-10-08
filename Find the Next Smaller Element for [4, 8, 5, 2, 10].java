// Q42. Find the Next Smaller Element for [4, 8, 5, 2, 10].
import java.util.Stack;

public class MonotonicStack_Q42_Find_the_Next_Smaller_Element_for_4_8_5_2_10 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 10};
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores values
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) stack.pop();
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " -> " + result[i]);
        }
    }
}
