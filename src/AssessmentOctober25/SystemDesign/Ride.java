package AssessmentOctober25.SystemDesign;

public class Ride {
    int id;
    Passenger passenger;
    Driver driver;
    String status; // REQUESTED, ONGOING, COMPLETED, CANCELLED

    public Ride(int id, Passenger passenger, Driver driver, String status) {
        this.id = id;
        this.passenger = passenger;
        this.driver = driver;
        this.status = status;
    }

    public int getId() { return id; }
    public Passenger getPassenger() { return passenger; }
    public Driver getDriver() { return driver; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; } // REQUESTED, ONGOING, COMPLETED, CANCELLED

    @Override
    public String toString() {
        return "Ride{id=" + id + ", passenger=" + passenger.getName() +
                ", driver=" + driver.getName() + ", status='" + status + "'}";
    }
}
