// Q23. A printer receives four documents. Implement a queue and print the document processing order.
import java.util.*;

public class Queue_Q23_A_printer_receives_four_documents_Implement_a_queue_and_print_the_document_processing_order {
    public static void main(String[] args) {
        Queue<String> printer = new LinkedList<>();
        printer.add("Doc1");
        printer.add("Doc2");
        printer.add("Doc3");
        printer.add("Doc4");
        System.out.println("Processing order:");
        while (!printer.isEmpty()) {
            System.out.println("Printing " + printer.poll());
        }
    }
}
