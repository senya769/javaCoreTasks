package arseniyusik.lesson18_concurrency.task4.model;

public class MaxThread extends Thread {
    private final int[] arr;

    public MaxThread(int[] arr, String name) {
        super(name);
        this.arr = arr;
    }

    public void run() {
        int max = arr[0];
        for (int number : arr) {
            max = max < number ? number : max;
        }
        StringBuilder builder = new StringBuilder(Thread.currentThread().getName()).
                append(" finished job ").
                append(" max = ").
                append(max);
        System.out.println(builder);
    }
}
