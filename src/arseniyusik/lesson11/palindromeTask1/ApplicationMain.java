package arseniyusik.lesson11.palindromeTask1;

import java.io.*;

public class ApplicationMain {
    public static void main(String[] args)  {
        String dir = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\palindromeTask1\\";
        String file = "text.txt";
        String newFile = "palindromes.txt";
        dir += newFile;
        TextFile textFile = new TextFile(dir);
        try {
            System.out.println(textFile.createNewFile().toString());
            textFile.writePalindromes(file,newFile);
        } catch (FileNotFoundException erFile) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
