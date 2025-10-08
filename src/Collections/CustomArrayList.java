package Collections;
import java.util.*;

class CustomArrayList<T> {
    private Object[] data;  // backing array
    private int size = 0;   // number of elements

    private static final int INITIAL_CAPACITY = 5;

    public CustomArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }

    public void add(T value) {
        // Resize if full
        if (size == data.length) {
            increaseCapacity();
        }
        data[size++] = value;
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    private void increaseCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
        System.out.println("Resized to " + newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }
}
