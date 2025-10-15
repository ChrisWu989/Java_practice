package Collections;
import java.util.*;
import java.util.stream.*;

public class StreamsPractice2 {
    public static void main(String[] args) {
        // List<Integer> ll = Arrays.asList(1,2,3);
        // Stream<Integer> stream = ll.stream()
        // .filter(i -> i > 2)
        // .peek(System.out::println)
        // .map(i -> i*-1)
        // .peek(System.out::println)
        // .sorted().peek(System.out::println)
        // .peek(System.out::println);


        // // Terminal Operations
        // List<Integer> ll2 = stream.collect(Collectors.toList());

        // long res = stream.count();
        // System.out.println(res);

        // stream.forEach((i) -> System.out.println(1));

        // Object[] o = stream.toArray();
        // stream.reduce((a, b) -> a+b).ifPresent((System.out::println));

        ///

        List<Integer> ll3 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long currentTimeserial = System.currentTimeMillis();

        ll3.stream().map(i -> i*-1).forEach(System.out::println);
        System.out.println("Total time taken: " + (System.currentTimeMillis() - currentTimeserial));

        // Parallel Stream
        
        long currentTimeparallel = System.currentTimeMillis();

        ll3.parallelStream().map(i -> i*-1).forEach(System.out::println);
        System.out.println("Total time taken: " + (System.currentTimeMillis() - currentTimeparallel));
    }

}
//Create student class where we have student id, dept, subjectname
// we want to group students by depts
// we want to make list of students
// Use collections 