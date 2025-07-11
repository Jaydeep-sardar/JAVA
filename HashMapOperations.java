// HashMap example with all basic operations in Java
import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(2, "Second"); // Updates value for key 2
        System.out.println("HashMap after adding elements: " + map);

        // Remove key-value pair
        map.remove(1);
        System.out.println("HashMap after removing key 1: " + map);

        // Check if key exists
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains key 4? " + map.containsKey(4));

        // Check if value exists
        System.out.println("Contains value 'Three'? " + map.containsValue("Three"));
        System.out.println("Contains value 'Four'? " + map.containsValue("Four"));

        // Get value by key
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 4: " + map.get(4));

        // Size of HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Check if HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // Iterate over HashMap
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Clear HashMap
        map.clear();
        System.out.println("HashMap after clear(): " + map);
        System.out.println("Is HashMap empty after clear? " + map.isEmpty());
    }
}
