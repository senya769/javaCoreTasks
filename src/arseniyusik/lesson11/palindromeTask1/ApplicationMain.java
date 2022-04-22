package arseniyusik.lesson11.palindromeTask1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ApplicationMain {
    public static void main(String[] args) throws IOException {
        StringBuilder str = new StringBuilder();
        String dir = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\palindromeTask1\\text.txt";
        File file = new File(dir);
        if (file.createNewFile()) {
            str.append("Файл создан");
            System.out.println(str);
        } else {
            str.append("Файл уже существует!");
            System.out.println(str);
        }
        BufferedInputStream inFile = new BufferedInputStream(new FileInputStream(dir));
        BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream(dir.replace("text","palindrome")));
        BufferedReader bufferRead = new BufferedReader(new FileReader(dir));
        try (inFile;outFile) {
            String line = bufferRead.readLine();
            String[] words = line.split("\\s");
            for (String j : words) {
                StringBuilder builder = new StringBuilder(j), palindroms = new StringBuilder();
                if (j.equals(builder.reverse().toString())) {
                    palindroms.append(j);
                    outFile.write(j.getBytes());
                }
                System.out.println(palindroms);
            }
        }
    }
}
