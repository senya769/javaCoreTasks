package arseniyusik.lesson18_concurrency.task5.model;

import java.io.*;
import java.util.Arrays;

public class SaveAsThread implements Runnable{

   int []arr;

    public SaveAsThread(int [] mas){
      this.arr = mas;
    }
    @Override
    public  void run() {
        try (        FileWriter  file = new FileWriter("arrayThreads.txt",true)){
            synchronized (this){
            file.write(Arrays.toString(arr)+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" finished");
    }
}
