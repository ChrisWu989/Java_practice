package Annotations;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalArgumentException {
        Class<?> clazz = obj.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);

            if(field.isAnnotationPresent(NotEmpty.class)){
                Object value = field.get(obj);
                NotEmpty annotaion = field.getAnnotation(NotEmpty.class);

                if (value == null || value instanceof String && ((String) value).trim().isEmpty()){
                    throw new IllegalArgumentException("Field validation failed");
                }
            }
        }
    }
}
