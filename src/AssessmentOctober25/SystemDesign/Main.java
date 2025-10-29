package AssessmentOctober25.SystemDesign;

public class Main {
    public static void main(String[] args) {
        DriverService driverService = new DriverService();
        PassengerService passengerService = new PassengerService();
        NotificationService notificationService = new NotificationService();
        RideService rideService = new RideService(driverService, notificationService);

        // Register drivers
        driverService.registerDriver("Alice");
        driverService.registerDriver("Bob");

        // Register passengers
        Passenger p1 = passengerService.registerPassenger("John", "Downtown", "Airport");
        Passenger p2 = passengerService.registerPassenger("Mary", "Mall", "Station");
        Passenger p3 = passengerService.registerPassenger("Ethan", "Park", "University");

        // Simulate concurrent ride requests
        Runnable request1 = () -> rideService.createRide(p1);
        Runnable request2 = () -> rideService.createRide(p2);
        Runnable request3 = () -> rideService.createRide(p3);

        Thread t1 = new Thread(request1);
        Thread t2 = new Thread(request2);
        Thread t3 = new Thread(request3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print all rides
        System.out.println("\nCurrent Rides:");
        for (Ride r : rideService.getAllRides()) {
            System.out.println(r);
        }
    }
}
