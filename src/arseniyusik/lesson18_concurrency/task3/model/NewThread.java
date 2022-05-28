package arseniyusik.lesson18_concurrency.task3.model;

public class NewThread extends Thread {
    final StringBuilder builder;

    public NewThread(StringBuilder builder) {
        this.builder = builder;
    }

    public void run() {
        synchronized (builder) {
            for (int i = 0; i < 100; ++i) {
                System.out.println(builder);
            }
            builder.append(1);
        }
    }
}