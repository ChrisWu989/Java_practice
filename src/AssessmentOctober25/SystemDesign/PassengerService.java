package AssessmentOctober25.SystemDesign;

import java.util.ArrayList;
import java.util.List;

public class PassengerService {
    private final List<Passenger> passengers = new ArrayList<>();
    private int nextId = 1;

    public Passenger registerPassenger(String name, String pickup, String destination) {
        Passenger p = new Passenger(nextId++, name, pickup, destination);
        passengers.add(p);
        return p;
    }
}
