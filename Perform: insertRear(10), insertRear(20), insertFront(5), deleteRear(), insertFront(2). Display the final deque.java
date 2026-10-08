// Q32. Perform: insertRear(10), insertRear(20), insertFront(5), deleteRear(), insertFront(2). Display the final deque.
import java.util.*;

public class Deque_Q32_Perform_insertRear_10_insertRear_20_insertFront_5_deleteRear_insertFront_2_Display_the_final_deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(10);   // insertRear(10)
        dq.addLast(20);   // insertRear(20)
        dq.addFirst(5);   // insertFront(5)
        dq.removeLast();  // deleteRear()
        dq.addFirst(2);   // insertFront(2)
        System.out.println("Final deque: " + dq);
    }
}
