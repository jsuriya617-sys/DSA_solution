// Q31. Implement a Deque with insertFront(), insertRear(), deleteFront(), and deleteRear().
import java.util.*;

public class Deque_Q31_Implement_a_Deque_with_insertFront_insertRear_deleteFront_and_deleteRear {
    static ArrayDeque<Integer> dq = new ArrayDeque<>();

    static void insertFront(int x) {
        dq.addFirst(x);
    }

    static void insertRear(int x) {
        dq.addLast(x);
    }

    static void deleteFront() {
        if (dq.isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }
        System.out.println("Deleted from front: " + dq.removeFirst());
    }

    static void deleteRear() {
        if (dq.isEmpty()) {
            System.out.println("Deque Underflow");
            return;
        }
        System.out.println("Deleted from rear: " + dq.removeLast());
    }

    public static void main(String[] args) {
        insertRear(10);
        insertRear(20);
        insertFront(5);
        System.out.println("Deque: " + dq);
        deleteFront();
        deleteRear();
        System.out.println("Deque: " + dq);
        deleteFront();
        deleteFront(); // empty
    }
}
