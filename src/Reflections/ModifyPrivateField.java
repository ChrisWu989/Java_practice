package Reflections;
import java.lang.reflect.Field;

class Person {
    private String name = "John";

    public String getName() {
        return name;
    }
}

public class ModifyPrivateField {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            System.out.println("Before modification: " + person.getName());

            // Access the private field "name"
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);  // Allow access to private field

            // Modify the value
            field.set(person, "Alice");

            System.out.println("After modification: " + person.getName());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
