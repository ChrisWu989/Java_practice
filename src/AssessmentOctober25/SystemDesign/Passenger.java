package AssessmentOctober25.SystemDesign;

public class Passenger {
    int id;
    String name;
    String pickupLocation;
    String destination;

    public Passenger(int id, String name, String pickupLocation, String destination) {
        this.id = id;
        this.name = name;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPickupLocation() { return pickupLocation; }
    public String getDestination() { return destination; }
}
