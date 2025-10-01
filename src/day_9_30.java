interface Animal {
    void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}

class Bird implements Animal {
    public void speak() {
        System.out.println("Tweet!");
    }
}

class Car {
    void drive() {
        System.out.println("Driving a car...");
    }
}

class Bike {
    void drive() {
        System.out.println("Riding a bike...");
    }
}

class Truck {
    void drive() {
        System.out.println("Driving a truck...");
    }
}

public class day_9_30 {
    public static void main(String[] args) {
        Object vehicle = new Truck();  // try new Car(), new Bike()

        switch (vehicle) {
            case Car c-> c.drive();
            case Bike b -> b.drive();
            case Truck t -> t.drive();
            default -> System.out.println("Unknown vehicle!");
        }

        Animal animal = new Cat();  // try new Dog(), new Bird()

        switch (animal) {
            case Dog d   -> d.speak();
            case Cat c   -> c.speak();
            case Bird b  -> b.speak();
            default -> System.out.println("Unknown animal!");
        }
    }
}
