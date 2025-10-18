package Threading;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MeetingRoom {

    
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    private boolean isOccupied;

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

            isOccupied = false;
            condition.signal();
        }
        finally {
            lock.unlock();
        }

        System.out.println("Left the room " + e.getfirstName());
    }
}
