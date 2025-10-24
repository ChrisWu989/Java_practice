package Threading;

public class Employee extends Thread {

    private String firstname;
    private MeetingRoom  meetingRoom;

    private MeetingRoomReadWrite mrr;
    private MeetingRoomStamped meetingRoomStamped;
    private MeetingRoomSemaphore meetingRoomSemaphore;

    public Employee(String firstname, MeetingRoom meetingRoom) {
        this.firstname = firstname;
        this.meetingRoom = meetingRoom;
    }

    public Employee(String firstname, MeetingRoomReadWrite mrr) {
        this.firstname = firstname;
        this.mrr = mrr;
    }

    public Employee(String firstname, MeetingRoomStamped meetingRoomStamped) {
        this.firstname = firstname;
        this.meetingRoomStamped = meetingRoomStamped;
    }

    public Employee(String firstname, MeetingRoomSemaphore meetingRoomSemaphore) {
        this.firstname = firstname;
        this.meetingRoomSemaphore = meetingRoomSemaphore;
    }

    public String getFirstName() {
        return firstname;
    }

    @Override
    public void run() {
        if (meetingRoom != null) {
            meetingRoom.enterRoom(this);
        } else if (mrr != null) {
            // Use new ReadWriteLock room
            mrr.peekRoom(this);
            mrr.enterRoomRW(this);
        } else if (meetingRoomStamped != null) {
            // Stamped Lock
            meetingRoomStamped.checkStatus(this); // read status
            meetingRoomStamped.enterRoom(this);   // write lock to enter
            try {
                Thread.sleep(1000);                        // simulate time in room
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            meetingRoomStamped.leaveRoom(this);   // write lock to leave
        } else if (meetingRoomSemaphore != null) {
            meetingRoomSemaphore.enterRoom(firstname); // enter using semaphore
        }
    }

}
