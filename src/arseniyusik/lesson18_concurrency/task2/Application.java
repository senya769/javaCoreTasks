package arseniyusik.lesson18_concurrency.task2;

import arseniyusik.lesson18_concurrency.task2.model.RunThread;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; ++i) {
            RunThread myNewThread = new RunThread();
           Thread thread = new Thread(myNewThread);
           thread.start();
           thread.join();
        }

    }
}
