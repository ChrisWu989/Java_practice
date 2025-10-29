package AssessmentOctober25.SystemDesign;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Driver {
    int id;
    String name;
    String currentLocation;
    boolean isAvailable; // false when driver has a passenger
    private final Lock lock = new ReentrantLock(); // Concurrency

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
        this.isAvailable = true;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isAvailable() { return isAvailable; }
    public Lock getLock() { return lock; }
    public void setAvailable(boolean available) { this.isAvailable = available; }
}

