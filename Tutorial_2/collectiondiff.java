import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        // Using HashSet
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana"); hashSet.add("Banana");
        treeSet.add("Apple");  hashSet.add("Apple");
        treeSet.add("Mango");  hashSet.add("Mango");
        treeSet.add("Cherry"); hashSet.add("Cherry");


        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);

        /* OUTPUT
        TreeSet: [Apple, Banana, Cherry, Mango]
            // Sorted in natural (alphabetical) order.

        HashSet: [Mango, Banana, Apple, Cherry]
            // An arbitrary order => may change
         */
    }
}
