package zJavaCertPractice.Nov12;
interface Speed{
    int speed = 40;
}
class Vehicle implements Speed {
    public static int speed = 60; // needs var type
}

class Car extends Vehicle implements Speed {
    public static void main(String[] args) {
        speed = 80; // Error ref from interface and vehicle
        System.out.println(speed);
        // Comment vehicle speed is static final
        // Comment interface speed works
    }
}
