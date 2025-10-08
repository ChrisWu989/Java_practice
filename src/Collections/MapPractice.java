package Collections;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();
        map.put(null, "one");
        map.put(0, "Zero");
        map.put(1, "two");

        System.out.println(map.toString());

        // hash, key, value, next, before, after
        // LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        // linkedHashMap.put(1, "One");
        // linkedHashMap.put(2,"Two");
        // linkedHashMap.put(3, "Three");

        // linkedHashMap.get(2); //which element accessed requently goes to end
        // linkedHashMap.forEach((s,e) -> System.out.println(s + " " + e));

        Map<Integer, String> treemap = new TreeMap<>((Integer o1, Integer o2) -> o2 - o1);
        treemap.put(2, "Three");
        treemap.put(0,"Zero");
        treemap.put(1, "Two");

        treemap.forEach((Integer integer,String s) -> System.out.println(integer + ":" + s));

    //     System.out.println(map.get(2));

    //     CustomArrayList<Integer> customList = new CustomArrayList<>();
    //     for (int i = 0; i < 10; i++) {
    //         customList.add(i);
    //     }
    //     System.out.println(customList);
    }
}
