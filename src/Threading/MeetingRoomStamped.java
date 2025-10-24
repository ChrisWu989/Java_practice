package Threading;

import java.util.concurrent.locks.StampedLock;

class MeetingRoomStamped {

    private boolean isOccupied = false;
    private final StampedLock lock = new StampedLock();

    // Employee enters the room (write lock)
    public void enterRoom(Employee e) {
        boolean entered = false;

        while (!entered) {
            long stamp = lock.writeLock(); // acquire exclusive lock
            try {
                if (!isOccupied) {
                    isOccupied = true;
                    System.out.println(e.getFirstName() + " entered the room.");
                    entered = true;
                }
            } finally {
                lock.unlockWrite(stamp); // release immediately
            }

            if (!entered) {
                System.out.println(e.getFirstName() + " waiting, room is occupied.");
                try {
                    Thread.sleep(500); // wait before retrying
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    // Employee leaves the room (write lock)
    public void leaveRoom(Employee e) {
        long stamp = lock.writeLock();
        try {
            isOccupied = false;
            System.out.println(e.getFirstName() + " left the room.");
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    // Check room status (optimistic read)
    public void checkStatus(Employee e) {
        long stamp = lock.tryOptimisticRead();
        boolean occupied = isOccupied;

        if (!lock.validate(stamp)) {
            stamp = lock.readLock(); // fallback to read lock
            try {
                occupied = isOccupied;
            } finally {
                lock.unlockRead(stamp);
            }
        }

        System.out.println(e.getFirstName() + " sees room is " + (occupied ? "occupied" : "free"));
    }
}