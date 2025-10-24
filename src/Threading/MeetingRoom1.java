package Threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MeetingRoom1 {

    private static boolean isOccupied = false; // not static anymore

    public void enterRoom(Employee1 e, ReentrantLock lock, Condition condition) {
        lock.lock();
        try {

            // wait if room is occupied
            while (isOccupied) {
                try {
                    condition.await(); // releases lock, waits until signaled
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            // mark occupied
            isOccupied = true;
            System.out.println(e.getFirstName() + " entered the room.");

        } finally {
            lock.unlock();
        }

        // simulate time spent in room
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // leaving the room
        lock.lock();
        try {
            isOccupied = false;
            System.out.println(e.getFirstName() + " left the room.");
            condition.signal(); // wake up one waiting thread
        } finally {
            lock.unlock();
        }
    }

}