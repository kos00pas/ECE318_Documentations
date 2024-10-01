import java.util.*;

public class Main {
    public static void main(String[] args) {

        // WRONG USAGE (WHY ?)  //There are interfaces
        // Will not run
         Map<String, Integer> map = new Map<>(); // WRONG
         Set<String> set = new Set<>();// WRONG
         List<String> list = new List<>();// WRONG
         Stack<Integer> stack = new Stack<>(); //*** CORRECT, why ?
         Queue<String> queue = new Queue<>();// WRONG

        // CORRECT USAGE:
        Map<String, Integer> map = new HashMap<>(); // HashMap implements Map
        Set<String> set = new HashSet<>(); // HashSet implements Set
        List<String> list = new ArrayList<>(); // ArrayList implements List
        Stack<Integer> stack = new Stack<>(); // Stack implements List
        Queue<String> queue = new LinkedList<>(); // LinkedList implements Queue

    }
}