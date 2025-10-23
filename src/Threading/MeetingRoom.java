package Threading;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MeetingRoom {

    
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean isOccupied = false;

    public void enterRoom(Employee e) {
        lock.lock();
        System.out.println("Entering Room " + e.getfirstName());

        try {
            isOccupied = true;
            while (isOccupied){
                try{
                    Thread.sleep(1000);
                    condition.await();
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }

            isOccupied = true;
            condition.signal();
        }
        finally {
            lock.unlock();
        }

        System.out.println("Left the room " + e.getfirstName());
    }
}
