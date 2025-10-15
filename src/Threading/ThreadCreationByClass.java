package Threading;

public class ThreadCreationByClass extends Thread{
    @Override
    public void run(){
        System.out.println("Thread Creation by class" + Thread.currentThread().getName());;
    }

}
