import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> listIterator = list.iterator();
        System.out.println("List:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());  // Output: A, B, C
        }

        // Set
        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
        Iterator<String> setIterator = set.iterator();
        System.out.println("\nSet:");
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());  // Output: A, B, C (order may vary)
        }

        // Queue
        Queue<String> queue = new LinkedList<>(Arrays.asList("A", "B", "C"));
        Iterator<String> queueIterator = queue.iterator();
        System.out.println("\nQueue:");
        while (queueIterator.hasNext()) {
            System.out.println(queueIterator.next());  // Output: A, B, C
        }

        // Stack (using Deque)
        Deque<String> stack = new ArrayDeque<>(Arrays.asList("A", "B", "C"));
        Iterator<String> stackIterator = stack.iterator();
        System.out.println("\nStack:");
        while (stackIterator.hasNext()) {
            System.out.println(stackIterator.next());  // Output: A, B, C
        }

        // Map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Iterator<Map.Entry<String, Integer>> mapIterator = map.entrySet().iterator();
        System.out.println("\nMap:");
        while (mapIterator.hasNext()) {
            Map.Entry<String, Integer> entry = mapIterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());  // Output: A: 1, B: 2, C: 3 (order may vary)
        }
    }
}
