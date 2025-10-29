package AssessmentOctober25.SystemDesign;

import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private final List<Driver> drivers = new ArrayList<>();
    private int nextId = 1;

    public Driver registerDriver(String name) {
        Driver d = new Driver(nextId++, name);
        drivers.add(d);
        return d;
    }

    public List<Driver> getAvailableDrivers() {
        List<Driver> available = new ArrayList<>();
        for (Driver d : drivers) {
            if (d.isAvailable()) available.add(d);
        }
        return available;
    }
}
