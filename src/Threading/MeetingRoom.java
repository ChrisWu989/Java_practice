package Threading;

public class MeetingRoom {

    private boolean isOccupied;

    public synchronized void enterRoom(Employee e) {
        System.out.println("Entering Room " + e.getfirstName());
        while (isOccupied){
            try{
                Thread.sleep(1000);
                wait();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }

        System.out.println("Left the room " + e.getfirstName());
        notify();
    }
}
