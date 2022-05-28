package arseniyusik.lesson18_concurrency.task4;

import arseniyusik.lesson18_concurrency.task4.model.MaxThread;
import arseniyusik.lesson18_concurrency.task4.model.MinThread;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int[] array = new int[5];
        for(int i = 0; i < array.length; ++i){
            //array[i] = new Scanner(System.in).nextInt();
            array[i] = new Random().nextInt(50)+1;
        }
        System.out.println(Arrays.toString(array));
        MaxThread maxThread = new MaxThread(array,"MaxThread");
        MinThread minThread = new MinThread(array,"MinThread");
        maxThread.start(); minThread.start();
    }
}
