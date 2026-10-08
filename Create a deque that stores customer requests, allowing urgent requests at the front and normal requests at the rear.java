// Q33. Create a deque that stores customer requests, allowing urgent requests at the front and normal requests at the rear.
import java.util.*;

public class Deque_Q33_Create_a_deque_that_stores_customer_requests_allowing_urgent_requests_at_the_front_and_normal_requests_at_the_rear {
    public static void main(String[] args) {
        Deque<String> requests = new ArrayDeque<>();
        requests.addLast("Normal-1");
        requests.addLast("Normal-2");
        requests.addFirst("URGENT-1");   // urgent goes to the front
        requests.addLast("Normal-3");
        requests.addFirst("URGENT-2");
        System.out.println("Requests: " + requests);
        System.out.println("Processing order:");
        while (!requests.isEmpty()) {
            System.out.println(requests.removeFirst());
        }
    }
}
