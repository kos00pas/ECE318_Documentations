import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorVsForEachMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Value1");
        map.put(2, "Value2");
        map.put(3, "Value3");

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
