package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;

public class PracticeCollection {
    public static void main(String[] args) {
        // Iterator<Integer> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // Queue FIFO

        // Queue<Integer> queue = new LinkedList<>();
        // PriorityQueue<Integer> queue = new PriorityQueue<>();
        // queue.add(1);
        // queue.add(2);
        // queue.add(4);

        // Iterator<Integer> iterator1 = queue.iterator();
        // while (iterator1.hasNext()) {
        //     System.out.println(iterator1.next());
            
        // }

        // Product[] products = new Product[4];
        // products[0] = new Product("Apple Smartphone", "Test", 4);
        // products[1] = new Product("Samsung Smartphone", "Test", 3);
        // products[2] = new Product("Random Smartphone", "Test", 2);
        // products[3] = new Product("Max Smartphone", "Test", 3);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Apple Smartphone", "Test", 4));
        productList.add(new Product("Samsung Smartphone", "Test", 3));
        productList.add(new Product("Random Smartphone", "Test", 2));
        productList.add(new Product("Max Smartphone", "Test", 3));

        //Collections.sort(productList, (o1, o2) -> o2.getRating() - o1.getRating());
        //System.out.println(productList.toString());

        // Comparator and Comparable
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        // list.isEmpty();
        // list.toArray();

        Collections.sort(productList, new NameComparator());
    }
}
