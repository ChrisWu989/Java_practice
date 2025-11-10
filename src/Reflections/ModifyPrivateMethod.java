package Reflections;
import java.lang.reflect.Method;

class Person {
    private void greet(String message) {
        System.out.println("Private greet: " + message);
    }
}

public class ModifyPrivateMethod {
    public static void main(String[] args) {
        try {
            Person person = new Person();

            // Access the private method "greet"
            Method method = Person.class.getDeclaredMethod("greet", String.class);
            method.setAccessible(true);  // Allow access to private method

            // Invoke the private method
            method.invoke(person, "Hello, world!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
