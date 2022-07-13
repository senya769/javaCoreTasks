package arseniyusik.lesson18_concurrency.blocking;

import java.util.Arrays;

public class BlockingQueue {
    private int array[];
    private int capacity;
    private int countItem = 0;
    private int tail = 0;
    private int head = 0;
    BlockingQueue(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
    }
    public void addItem(int number) throws InterruptedException {
        if(countItem != capacity){
            array[tail] = number;
            tail++;
            countItem++;
        }else {
            wait();
            tail = 0;
            array[tail] = number;
            tail++;
            countItem++;
        }
    }
    public void poolItem(){
        array[head] = Integer.parseInt(null);
    }
    @Override
    public String toString() {
        return "BlockingQueue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
