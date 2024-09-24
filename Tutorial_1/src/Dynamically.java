import java.util.ArrayList;

public class Dynamically {
    public static void main(String[] args) {
        // Initializing an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int i = 40; i <= 60; i += 10) {
            numbers.add(i); // Add 40, 50, 60
        }

        System.out.println("--------------------");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("--------------------");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) >= 50) {
                numbers.remove(i);
            }
        }

        System.out.println("--------------------");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
