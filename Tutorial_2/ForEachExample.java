import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println("List:");
        for (String item : list) {
            System.out.println(item);  // Output: A, B, C
        }

        // Set
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
        System.out.println("\nSet:");
        for (String item : set) {
            System.out.println(item);  // Output: A, B, C (order may vary)
        }

        // Queue
        Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println("\nQueue:");
        for (String item : queue) {
            System.out.println(item);  // Output: A, B, C
        }

        // Stack (using Deque)
        Deque<String> stack = new ArrayDeque<>(Arrays.asList("A", "B", "C"));
        System.out.println("\nStack:");
        for (String item : stack) {
            System.out.println(item);  // Output: A, B, C (in insertion order)
        }

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // For keys
        System.out.println("\nMap Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);  // Output: A, B, C (order may vary)
        }

        // For values
        System.out.println("\nMap Values:");
        for (Integer value : map.values()) {
            System.out.println(value);  // Output: 1, 2, 3 (order may vary)
        }

        // For key-value pairs
        System.out.println("\nMap Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());  // Output: A: 1, B: 2, C: 3 (order may vary)
        }
    }
}
