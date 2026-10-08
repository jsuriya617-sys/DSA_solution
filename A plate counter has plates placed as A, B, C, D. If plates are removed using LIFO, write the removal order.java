// Q6. A plate counter has plates placed as A, B, C, D. If plates are removed using LIFO, write the removal order.
import java.util.Stack;

public class LIFO_Q06_A_plate_counter_has_plates_placed_as_A_B_C_D_If_plates_are_removed_using_LIFO_write_the_removal_order {
    public static void main(String[] args) {
        Stack<Character> plates = new Stack<>();
        for (char c = 'A'; c <= 'D'; c++) plates.push(c);
        System.out.print("Removal order: ");
        while (!plates.isEmpty()) System.out.print(plates.pop() + " ");
        System.out.println();
    }
}
