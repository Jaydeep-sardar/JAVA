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
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(2, "Second"); // Updates value for key 2
        map.put(5, "Fifth"); // Updates value for key 5
        System.out.println("HashMap after adding elements: " + map);

        // Remove key-value pair
        map.remove(1);
        map.remove(10);
        System.out.println("HashMap after removing key 1 and 10: " + map);

        // Check if key exists
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains key 4? " + map.containsKey(4));
        System.out.println("Contains key 11? " + map.containsKey(11));

        // Check if value exists
        System.out.println("Contains value 'Three'? " + map.containsValue("Three"));
        System.out.println("Contains value 'Fifth'? " + map.containsValue("Fifth"));
        System.out.println("Contains value 'Ten'? " + map.containsValue("Ten"));

        // Get value by key
        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 4: " + map.get(4));
        System.out.println("Value for key 11: " + map.get(11));

        // Size of HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Check if HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // Iterate over HashMap using entrySet
        System.out.println("Iterating over HashMap (entrySet):");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Iterate over HashMap using keySet
        System.out.println("Iterating over HashMap (keySet):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        // Iterate over HashMap using values
        System.out.println("Iterating over HashMap (values):");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Replace value for a key
        map.replace(3, "Third");
        System.out.println("HashMap after replacing value for key 3: " + map);

        // Put if absent
        map.putIfAbsent(11, "Eleven");
        map.putIfAbsent(2, "SecondAgain"); // Won't update as key 2 exists
        System.out.println("HashMap after putIfAbsent: " + map);

        // Clear HashMap
        map.clear();
        System.out.println("HashMap after clear(): " + map);
        System.out.println("Is HashMap empty after clear? " + map.isEmpty());
    }
}
