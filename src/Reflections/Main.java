package Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException{
        Class u1 = Class.forName("Reflections.UserOne");
        Class u2 = UserOne.class;

        Constructor[] userConstructors = u1.getDeclaredConstructors();
        for(Constructor con : userConstructors) {
            con.setAccessible(true);
            UserOne u3 = (UserOne) con.newInstance();
            System.out.println(u3.getEmail());
        }

        // u2.getClass();

        // UserOne u = new UserOne();
        // Class u3 = u.getClass();

        // System.out.println(u1.getName());

        // Field[] fields = u3.getDeclaredFields();
        // Method[] methods = u3.getDeclaredMethods();

        
        // for(Method m : methods){
        //     // System.out.println(m.getName());
        // }

        // for(Field field : fields){
        //     field.setAccessible(true);
        //     field.set(u,"name2")
        //     System.out.println(field.getName());
        // }
    }
}
