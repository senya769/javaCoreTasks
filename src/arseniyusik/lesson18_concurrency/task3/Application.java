package arseniyusik.lesson18_concurrency.task3;

import arseniyusik.lesson18_concurrency.task3.model.NewThread;

public class Application {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("a");
        NewThread thread1 = new NewThread(builder);
        NewThread thread2 = new NewThread(builder);
        NewThread thread3 = new NewThread(builder);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
