import java.util.ArrayList;

public class The_Arraylist {
        public static void main(String[] args) {
            // Initializing an ArrayList without Collections
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);
            numbers.add(40);
            numbers.add(50);

            for (int i = 0; i < numbers.size(); i++) {
                System.out.println("Index " + i + ": " + numbers.get(i));
            }

            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            }

            int i = 0;
            while (i < numbers.size()) {
                if (numbers.get(i) == 30) {
                    System.out.println("Found 30 at index: " + i);
                    break;
                }
                i++;
            }

            i = 0;
            do {
                if (numbers.get(i) < 30) {
                    numbers.remove(i);
                    i--;
                }
                i++;
            } while (i < numbers.size());

            System.out.println("\nChecking if 40 exists in the list:");
            if (numbers.contains(40)) {
                System.out.println("40 is in the list.");
            } else {
                System.out.println("40 is not in the list.");
            }

            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }