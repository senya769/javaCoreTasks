package arseniyusik.lesson11.palindromeTask1;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ApplicationMain {
    public static void main(String[] args)  {
        /*StringBuilder str = new StringBuilder();
        String dir = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\palindromeTask1\\text.txt";
        File file = new File(dir);

        BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream(dir.replace("text","palindromes")));
        BufferedReader bufferRead = new BufferedReader(new FileReader(dir));
        if (file.createNewFile()) {
            str.append("Файл создан");
            System.out.println(str);
        } else {
            str.append("Файл уже существует!");
            System.out.println(str);
        }
        StringBuilder builder = new StringBuilder(),palindroms = new StringBuilder();
        try (outFile;bufferRead) {
            String space = " "; // разбиение " " слов из строки
            byte [] b = space.getBytes();
            String line = bufferRead.readLine();
            String[] words = line.split(space);
            for (String j : words) { // проверка на палиндром
                builder.append(j);
                if (j.equals(builder.reverse().toString())) {
                  //  palindroms.append(j);
                    outFile.write(j.getBytes());
                 //   palindroms.append(space);
                    outFile.write(b);
                }
                System.out.print(palindroms);
                builder.setLength(0);palindroms.setLength(0);
            }
        } catch (IOException e){
            System.out.println(e.toString());
        }*/

        String dir = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\palindromeTask1\\";
        String file = "text.txt";
        //dir +=file;
        System.out.println(dir);
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
