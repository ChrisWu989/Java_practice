package AssessmentOctober25.SystemDesign;

class NotificationService {
    public void notifyPassenger(Passenger p, String message) {
        System.out.println("[Passenger " + p.getName() + "]: " + message);
    }

    public void notifyDriver(Driver d, String message) {
        System.out.println("[Driver " + d.getName() + "]: " + message);
    }
}
