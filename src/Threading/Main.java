package Threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Employee , Meeting Room .
        // MeetingRoom -> Independent -> entering the room and left the room
        // Employee 1, Employee2 , Employee 3
        // Only 1 Employee should be able to access the meeting room at one point of time.

        MeetingRoom meetingRoom = new MeetingRoom();

        Employee e1 = new Employee("Aileen", meetingRoom );
        Employee e2 = new Employee("Glen", meetingRoom );
        Employee e3 = new Employee("Neeraj", meetingRoom);

        e1.start();
        e2.start();
        e3.start();

        /// RentrantLock

    //     ReentrantLock sharedLock = new ReentrantLock();
    //     Condition sharedCondition = sharedLock.newCondition();

    //     MeetingRoom1 room1 = new MeetingRoom1();
    //     MeetingRoom1 room2 = new MeetingRoom1();
    //     MeetingRoom1 room3 = new MeetingRoom1();

    //     Employee1 e4 = new Employee1("Ali", room1, sharedLock, sharedCondition);
    //     Employee1 e5 = new Employee1("Bobby", room2, sharedLock, sharedCondition);
    //     Employee1 e6 = new Employee1("Charlie", room3, sharedLock, sharedCondition);

    //     e4.start();
    //     e5.start();
    //     e6.start();

    //     // Read Write Lock

    //     // Shared Lock -- Read operations. Multiple threads can have this lock.
    //     // Exclusive Lock -- One thread can have this lock only.

    //     MeetingRoomReadWrite mrr = new MeetingRoomReadWrite();

    //     Employee e7 = new Employee("Tom", mrr );
    //     Employee e8 = new Employee("Jacob", mrr );
    //     Employee e9 = new Employee("Neeraj", mrr);

    //     e7.start();
    //     e8.start();
    //     e9.start();

    //     // Stamped Lock
    //     // Thread 1 Thread 2
    //     // ID    Name  Status  Version
    //     // 2     Test12   Active  1

    //    MeetingRoomStamped mrs = new MeetingRoomStamped();

    //    Employee e10 = new Employee("Tom", mrs );
    //    Employee e11 = new Employee("Jacob", mrs );
    //    Employee e12 = new Employee("Neeraj", mrs);

    //    e10.start();
    //    e11.start();
    //    e12.start();

    //     // Semaphore

    //     MeetingRoomSemaphore semaphoreRoom = new MeetingRoomSemaphore(2);
    //     Employee e13 = new Employee("Henry", semaphoreRoom);
    //     Employee e14 = new Employee("Ivy", semaphoreRoom);
    //     Employee e15 = new Employee("Jack", semaphoreRoom);

    //     e13.start();
    //     e14.start();
    //     e15.start();
    }
}