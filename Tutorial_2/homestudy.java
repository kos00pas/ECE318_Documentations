import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionOfCollectionsExample {
    public static void main(String[] args) {
        // Creating a map where the key is an Integer and the value is a List of Strings
        Map<Integer, List<String>> mapOfLists = new HashMap<>();

        // Adding values to the map
        List<String> list1 = new ArrayList<>();
        list1.add("Item1");
        list1.add("Item2");
        mapOfLists.put(1, list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Item3");
        list2.add("Item4");
        mapOfLists.put(2, list2);

        // Using for-each loop
        System.out.println("Using for-each loop:");
        for (Map.Entry<Integer, List<String>> entry : mapOfLists.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            for (String item : entry.getValue()) {
                System.out.println("Value: " + item);
            }
        }

        // Using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, List<String>>> mapIterator = mapOfLists.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, List<String>> entry = mapIterator.next();
            System.out.println("Key: " + entry.getKey());

            Iterator<String> listIterator = entry.getValue().iterator();
            while (listIterator.hasNext()) {
                String item = listIterator.next();
                System.out.println("Value: " + item);
            }
        }
    }
}
