// Q43. Given daily temperatures [30, 32, 31, 35, 34, 36], find how many days each day must wait for a warmer temperature.
import java.util.Stack;

public class MonotonicStack_Q43_Given_daily_temperatures_30_32_31_35_34_36_find_how_many_days_each_day_must_wait_for_a_warmer_temperature {
    public static void main(String[] args) {
        int[] temps = {30, 32, 31, 35, 34, 36};
        int n = temps.length;
        int[] wait = new int[n]; // 0 means no warmer day ahead
        Stack<Integer> stack = new Stack<>(); // stores indexes
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int idx = stack.pop();
                wait[idx] = i - idx;
            }
            stack.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + " (" + temps[i] + ") waits " + wait[i] + " day(s)");
        }
    }
}
