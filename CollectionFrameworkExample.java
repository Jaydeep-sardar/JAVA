// Java Collection Framework Example
// Demonstrates usage of ArrayList, HashSet, and HashMap

import java.util.*;

public class CollectionFrameworkExample {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("ArrayList: " + list);

        // HashSet Example
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, will not be added
        System.out.println("HashSet: " + set);

        // HashMap Example
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap: " + map);

        // Iterating over ArrayList
        System.out.print("ArrayList elements: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Iterating over HashSet
        System.out.print("HashSet elements: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Iterating over HashMap
        System.out.println("HashMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
