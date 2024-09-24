public class The_Break_Continue {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        int i = 0;

        do {
            if (names[i].equals("Bob")) {
                i++;
                continue;
            }
            if (names[i].equals("Diana")) {
                break;
            }
            System.out.println(names[i]);
            i++;
        } while (i < names.length);

    }
}
