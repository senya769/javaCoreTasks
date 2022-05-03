package arseniyusik.lesson11.task2_palindromes;

import java.io.*;

public class ApplicationMain {
    public static void main(String[] args) {
        String dir = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\task2_palindromes\\";
        StringBuilder newFileName = new StringBuilder("resultTask2.txt").insert(0, dir);
        StringBuilder fileName = new StringBuilder("text.txt").insert(0, dir);
        String space = "\n"; //
        byte[] spaceBytes = space.getBytes();
        StringBuilder builder = new StringBuilder();
        try {

            File file = new File(newFileName.toString());
            builder.setLength(0);
            if (file.createNewFile()) {
                builder.append("Файл создан! ").append(file.getName());
            } else {
                builder.append("Файл с таким название уже существует! ").append(file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(builder);

        try (FileInputStream fileReader = new FileInputStream(fileName.toString());
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newFileName.toString()))) {
            StringBuilder buffer = new StringBuilder();
            int s;
            while ((s = fileReader.read()) != -1) {
                buffer.append((char) s); // запись всех символов из исходного файла fileName
            }

            String[] text = buffer.toString().split("[.!?]\\s*");  // разбиение по предложениям
            int countWords;
            for (String line : text) {
                countWords = TextEditor.wordsLength(line);
                if (countWords >= 3 && countWords <= 5) {

                    outputStream.write(line.getBytes());
                    outputStream.write(spaceBytes);
                } else {
                    String[] words = line.split("[\\p{Punct}\\s]+");// разбиение по словам
                    for (String word : words) {
                        if (TextEditor.isPalindrome(word)) {
                            outputStream.write(line.getBytes());
                            outputStream.write(spaceBytes);
                        }
                    }
                }
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

