package AssessmentOctober25.SystemDesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RideService {
    private final List<Ride> rides = Collections.synchronizedList(new ArrayList<>());
    private final DriverService driverService;
    private final NotificationService notificationService;
    private int nextRideId = 1;

    public RideService(DriverService driverService, NotificationService notificationService) {
        this.driverService = driverService;
        this.notificationService = notificationService;
    }

    // Concurrency-safe ride creation
    public Ride createRide(Passenger passenger) {
        for (Driver driver : driverService.getAvailableDrivers()) {
            // Attempt to lock driver to prevent concurrent booking
            if (driver.getLock().tryLock()) {
                try {
                    if (!driver.isAvailable()) continue; // recheck after acquiring lock
                    driver.setAvailable(false);
                    Ride ride = new Ride(nextRideId++, passenger, driver, "ONGOING");
                    rides.add(ride);

                    notificationService.notifyPassenger(passenger, "Ride assigned to " + driver.getName());
                    notificationService.notifyDriver(driver, "Assigned a ride for " + passenger.getName());

                    return ride;
                } finally {
                    driver.getLock().unlock();
                }
            }
        }

        System.out.println("No drivers available for " + passenger.getName());
        return null;
    }

    public void completeRide(Ride ride) {
        ride.setStatus("COMPLETED");
        ride.getDriver().setAvailable(true);
        notificationService.notifyPassenger(ride.getPassenger(), "Your ride is completed!");
        notificationService.notifyDriver(ride.getDriver(), "Ride completed. You are now available.");
    }

    public List<Ride> getAllRides() {
        return rides;
    }
}
