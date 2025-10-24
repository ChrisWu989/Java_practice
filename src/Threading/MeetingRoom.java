package Threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MeetingRoom {

    private  final ReentrantLock lock = new ReentrantLock();
    private  final Condition condition = lock.newCondition();
    private  boolean isOccupied = false;


    public void enterRoom(Employee e) {
        lock.lock();
        try {
            while (isOccupied) {
                try {
                    condition.await();
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }

            isOccupied = true;
            System.out.println("Entering room " + e.getFirstName());

            // simulate being inside the room
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }

            System.out.println("Left the room " + e.getFirstName());

            // release the room
            isOccupied = false;
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}