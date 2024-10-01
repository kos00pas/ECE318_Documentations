import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        // Without Generics
        List list = new ArrayList();  // No type specified
        list.add("Hello");
        list.add(10);  // Can add any type, no restriction

        // Requires casting to retrieve elements
        String str1 = (String) list.get(0);
        System.out.println("Without Generics: " + str1);

        // With Generics
        List<String> stringList = new ArrayList<>();  // Restricts to Strings
        stringList.add("Hello");
        // stringList.add(10);  // Compile-time error, prevents wrong type

        // No casting needed
        String str2 = stringList.get(0);
        System.out.println("With Generics: " + str2);
    }
}
