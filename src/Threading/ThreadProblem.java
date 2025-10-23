package Threading;
/*
Question
Print 1, 2, 3 in a sequence then repeat with 4 5 6 different threads
*/
public class ThreadProblem {
    private static final Object lock = new Object();
    private static int current = 1;
    private static final int MAX = 21;

    public static void main(String[] args) {
        Runnable task = () -> {
            int threadNum = Integer.parseInt(Thread.currentThread().getName()); // directly use thread name as number

            while (true) {
                synchronized (lock) {
                    if (current > MAX)
                        break;

                    if ((current - 1) % 3 + 1 == threadNum) {
                        System.out.println("Thread-" + threadNum + " → " + current);
                        current++;

                        lock.notifyAll();

                        // delay between groups (after 3 numbers)
                        if ((current - 1) % 3 == 0) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        // Create 3 threads named "1", "2", "3"
        for (int i = 1; i <= 3; i++) {
            new Thread(task, String.valueOf(i)).start();
        }
    }
}
