public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
        System.out.println("hey , i am "+ this.name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
