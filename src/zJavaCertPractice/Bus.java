package zJavaCertPractice;

class Vehicle {
    public void driveOnly(){
        System.out.println("Vehicle driving");
    }
}

public class Bus extends Vehicle{
    public void driveOnly(){
        System.out.println("Bus driving");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Bus b = new Bus();

        v.driveOnly();
        b.driveOnly();

        // V v = new bus
        v = b;
        v.driveOnly();
    }
}
