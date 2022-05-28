package arseniyusik.lesson18_concurrency.task5;

import arseniyusik.lesson18_concurrency.task5.model.SaveAsThread;

import java.io.File;
import java.util.Random;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("arrayThreads.txt");
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int[] arr3 = new int[5];
        for (int i = 0; i < arr1.length; ++i){
            arr1[i] = new Random().nextInt(30)+1;
            arr2[i] = new Random().nextInt(30)+1;
            arr3[i] = new Random().nextInt(30)+1;
        }
        // SaveAsThread save1 = new SaveAsThread(arr1);
        // SaveAsThread save2 = new SaveAsThread(arr2);
        // SaveAsThread save3 = new SaveAsThread(arr3);
        Thread thread1 = new Thread(new SaveAsThread(file,arr1));
        Thread thread2 = new Thread(new SaveAsThread(file,arr2));
        Thread thread3 = new Thread(new SaveAsThread(file,arr3));
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Done");
    }
}
