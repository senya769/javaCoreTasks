package arseniyusik.lesson18_concurrency.task5.model;

import java.io.*;
import java.util.Arrays;

public class SaveAsThread implements Runnable{
   private final File file;
   int []arr;
    public SaveAsThread(File file,int[] mas){
      this.arr = mas;
      this.file =file;
    }
    @Override
    public void run() {
        try {BufferedWriter writer = new BufferedWriter(new FileWriter("arrayThreads.txt"));
           writer.write("1");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"Thread finished");
    }
}
