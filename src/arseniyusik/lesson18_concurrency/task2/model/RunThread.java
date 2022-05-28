package arseniyusik.lesson18_concurrency.task2.model;

public class RunThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start work!");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; ++i) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished work!");
    }
}

