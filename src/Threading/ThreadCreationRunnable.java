package Threading;

public class ThreadCreationRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("ThreadCreationRunnable is running " + Thread.currentThread().getName());
    }

}
