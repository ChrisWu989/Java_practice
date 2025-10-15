package Threading;

public class Employee extends Thread{

    private String firstname;
    private MeetingRoom meetingRoom;

    public Employee(String firstname, MeetingRoom meetingRoom) {
        this.firstname = firstname;
        this.meetingRoom = meetingRoom;
    }
    
    public String getfirstName() {
        return firstname;
    }

    @Override
    public void run() {
        meetingRoom.enterRoom(this);
    }
}
