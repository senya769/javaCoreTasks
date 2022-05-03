package arseniyusik.lesson11.task3_censure;

import java.io.*;
import java.util.Arrays;

public class ApplicationMain {
    public static void main(String[] args) {
        String dir = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\task3_censure\\";
        StringBuilder nameFile = new StringBuilder("text.txt").insert(0, dir);
        StringBuilder nameCensureFile = new StringBuilder("censure.txt").insert(0, dir);
        File file = new File(nameCensureFile.toString());
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
