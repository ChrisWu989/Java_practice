package Threading;

public class Main {
    public static void main(String[] args) {
        
        // ThreadCreationRunnable threadCreationRunnable = new ThreadCreationRunnable();
        // Thread thread1 = new Thread(threadCreationRunnable);
        // thread1.start();

        // ThreadCreationByClass threadCreationByClass = new ThreadCreationByClass();
        // threadCreationByClass.start();

        // Employee, Meeting Room
        // MeetingRoom -> Independent -> entering the room and left the room
        // Employee 1, Employee 2, Employee 3
        // Only one Employee should be able to access the meeting room at one point of time
        
        MeetingRoom meetingRoom = new MeetingRoom();
        Employee e1 = new Employee("Howard", meetingRoom);
        Employee e2 = new Employee("Lebron", meetingRoom);
        Employee e3 = new Employee("Bronny", meetingRoom);

        // e1.setPriority(Thread.MAX_PRIORITY);
        e1.start();
        e2.start();
        e3.start();

    }
}
