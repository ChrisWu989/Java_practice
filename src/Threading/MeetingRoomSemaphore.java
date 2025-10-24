package Threading;

import java.util.concurrent.Semaphore;

class MeetingRoomSemaphore {
    private final Semaphore semaphore;

    public MeetingRoomSemaphore(int maxEmployees) {
        semaphore = new Semaphore(maxEmployees);
    }

    public void enterRoom(String employee) {
        try {
            System.out.println(employee + " trying to enter the room...");
            semaphore.acquire(); // wait for a permit
            System.out.println(employee + " entered the room.");
            Thread.sleep(1000); // simulate time in the room
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            leaveRoom(employee);
        }
    }

    public void leaveRoom(String employee) {
        System.out.println(employee + " left the room.");
        semaphore.release(); // release permit
    }
}