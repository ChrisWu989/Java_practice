package Collections;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();
        map.put(null, "one");
        map.put(0, "Zero");
        map.put(1, "two");

        System.out.println(map.toString());

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        System.out.println(map.get(2));

        //implement custom array list automatically incresae the elements 
        //default capacity of 16 must be a power of 2
        // default load factor used to determine if we resize hashmap or not
        //treeify 8 nodes
    }
}
