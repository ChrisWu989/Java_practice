package Threading;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MeetingRoomReadWrite {

    private boolean isOccupied = false;
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock(true);

    /** Peek room status (shared read lock) */
    public void peekRoom(Employee e) {
        rwLock.readLock().lock();
        try {
            String status = isOccupied ? "OCCUPIED" : "FREE";
            System.out.println(e.getFirstName() + " sees room is " + status);
        } finally {
            rwLock.readLock().unlock();
        }
    }

    /** Enter the room (exclusive write lock) */
    public void enterRoomRW(Employee e) {
        rwLock.writeLock().lock();
        try {
            // Wait until room is free
            while (isOccupied) {
                rwLock.writeLock().unlock(); // release to avoid deadlock
                try {
                    Thread.sleep(100);       // simple wait
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
                rwLock.writeLock().lock();   // reacquire write lock
            }

            // Mark room as occupied
            isOccupied = true;
            System.out.println(e.getFirstName() + " ENTERED the room");
        } finally {
            rwLock.writeLock().unlock();
        }

        // Simulate time inside the room
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        // Leaving the room
        rwLock.writeLock().lock();
        try {
            isOccupied = false;
            System.out.println(e.getFirstName() + " LEFT the room");
        } finally {
            rwLock.writeLock().unlock();
        }
    }
}
