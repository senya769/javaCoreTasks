package arseniyusik.lesson18_concurrency.task1;

import arseniyusik.lesson18_concurrency.task1.model.NewThread;

public class Application {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.start();
    }
}
