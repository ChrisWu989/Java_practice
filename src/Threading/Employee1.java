package Threading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Employee1 extends Thread {

    private String firstname;
    private MeetingRoom1 meetingRoom;
    private ReentrantLock lock;
    private Condition condition;

    public Employee1(String firstname, MeetingRoom1 meetingRoom, ReentrantLock lock, Condition condition) {
        this.firstname = firstname;
        this.meetingRoom = meetingRoom;
        this.lock = lock;
        this.condition = condition;
    }

    public String getFirstName() {
        return firstname;
    }

    @Override
    public void run() {
        meetingRoom.enterRoom(this, lock, condition);
    }
}