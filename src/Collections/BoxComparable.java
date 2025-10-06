package Collections;

class BoxComparable<T extends Comparable<T>> implements Comparable<BoxComparable<T>> {
    private T value;

    public BoxComparable(T value) { 
        this.value = value;
    }

    public T getValue() { 
        return value;
    }

    @Override
    public int compareTo(BoxComparable<T> other) {
        return this.value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
//how to implement comparator and comparable work in generic classes