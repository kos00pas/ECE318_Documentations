public class The_do_while {
    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie"};

        int i = 0;
        do {
            System.out.println(i + ": " + names[i]);
            i++;
        } while (i < names.length);

    }
}
