// Q8. A text editor records edits 1, 2, 3, 4. Implement a program that undoes edits in LIFO order.
import java.util.Stack;

public class LIFO_Q08_A_text_editor_records_edits_1_2_3_4_Implement_a_program_that_undoes_edits_in_LIFO_order {
    public static void main(String[] args) {
        Stack<Integer> edits = new Stack<>();
        for (int i = 1; i <= 4; i++) edits.push(i);
        while (!edits.isEmpty()) {
            System.out.println("Undo edit " + edits.pop());
        }
    }
}
