import java.util.*;

public class Util_package5{
    public static void main(String[] args) {
        // a. Vector
        Vector<String> vec = new Vector<>();
        vec.add("Nabin");
        vec.add("Bipin");
        System.out.println("Vector: " + vec);

        // b. Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());

        // c. Hashtable
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Apple");
        ht.put(2, "Banana");
        System.out.println("Hashtable: " + ht);

        // d. Random
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        System.out.println("Random number: " + randomNum);
    }
}