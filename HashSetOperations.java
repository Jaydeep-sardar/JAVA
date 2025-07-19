// HashSet example with all basic operations in Java
import java.util.HashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate, will not be added
        System.out.println("HashSet after adding elements: " + set);

        // Remove element
        set.remove(10);
        System.out.println("HashSet after removing 10: " + set);

        // Check if element exists
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Contains 40? " + set.contains(40));

        // Size of HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Check if HashSet is empty
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // Iterate over HashSet
        System.out.print("Iterating over HashSet: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Clear HashSet
        set.clear();
        System.out.println("HashSet after clear(): " + set);
        System.out.println("Is HashSet empty after clear? " + set.isEmpty());
    }
}
