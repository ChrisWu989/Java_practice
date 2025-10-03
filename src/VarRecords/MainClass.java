package VarRecords;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        var var = "Name";
        System.out.println(var);

        int[] a = {1, 2};
        var names = new String[]{};
        var students = new ArrayList<String>(); 

        Person p1 = new Person(1, "Dave");
        Person p2 = new Person(1,"Dave");

        System.out.println(p1.equals(p2));
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
