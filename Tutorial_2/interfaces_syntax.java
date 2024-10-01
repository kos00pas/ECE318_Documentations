public class ListExample {

    public static void main(String[] args) {

        ///VALID----------------------------------------
        /// Interface = Implemented
        List<String> list1 = new ArrayList<>();
        // Only List (interface) methods can be accessed.
             // However, they are implemented according to the ArrayList class.
            // => In LinkedList (which also implements the List interface),
                // the method implementations can vary, meaning LinkedList will provide-
                //  its own specific way of handling the same List methods.


        // Implemented = Implemented
        ArrayList<String> list4 = new ArrayList<>();
        // You can use all methods from ArrayList,
        // including methods like ensureCapacity(), which are not part of the List interface.
             list4.ensureCapacity(100); // Example of ArrayList-specific method

        ///INVALID----------------------------------------
        /// Implemented = Interface
         ArrayList<String> list2 = new List<>(); //WRONG
        // This is invalid because you cannot instantiate an interface.
        // Uncommenting this will result in a compilation error.

        /// Interface = Interface
         List<String> list3 = new List<>(); //WRONG
        // Also invalid because an interface cannot be instantiated.
        // List is an interface, so it cannot be used with the 'new' keyword to create an object.
    }
}
