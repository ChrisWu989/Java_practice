package Collections;

import java.util.*;
import java.util.stream.*;

public class Strem_Prac {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer i : list){
            if (i > 2){
                System.out.println(i);
            }
        }

        list.stream().filter((Integer i) -> i>2).forEach(System.out::println);

        // Stream Creation

        Integer[] array = new Integer[]{1, 2, 3};

        Stream<Integer> s1 = Arrays.stream(array);
        Stream<Integer> s2 = Stream.of(4, 5, 6);

        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1).add(2).add(3);


        Stream<String> stringStream = Stream.of("a", "b", "v");
        stringStream.map((String a) -> a.toUpperCase()).forEach(System.out::println);

        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(44,22,32),Arrays.asList(10,22,31));
        lists.stream().flatMap((List<Integer> s) -> s.stream()).forEach(System.out::println);
        
    }
}
