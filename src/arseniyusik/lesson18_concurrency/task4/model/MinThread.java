package arseniyusik.lesson18_concurrency.task4.model;

public class MinThread extends Thread{
    private final int[] arr;

    public MinThread(int[] arr, String name) {
        super(name);
        this.arr = arr;
    }

    public void run() {
        int min = arr[0];
        for (int number : arr) {
            min = min > number ? number : min;
        }
        StringBuilder builder = new StringBuilder(Thread.currentThread().getName()).
                append(" finished job ").
                append(" min = ").
                append(min);
        System.out.println(builder);
    }
}
