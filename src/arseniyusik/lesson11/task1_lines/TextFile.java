package arseniyusik.lesson11.task1_lines;

import java.io.*;

public class TextFile {
    private File file;
    private String dir;


    public TextFile() {
    }

    public TextFile(String dir) {
        this.dir = dir;
        this.file = new File(this.dir);
    }

    public StringBuilder createNewFile() throws IOException {
        StringBuilder str = new StringBuilder();
        if (this.file.createNewFile()) {
            str.append("Файл создан");
            //  System.out.println(str);
        } else {
            str.append("Файл уже существует!");
            // System.out.println(str);
        }
        return str;
    }

    public void writePalindromes(String nameFile, String nameNewFile) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new FileReader(this.dir.replace(nameNewFile, nameFile)));
        BufferedOutputStream outFile = new BufferedOutputStream(new FileOutputStream(this.dir));
        StringBuilder builder = new StringBuilder();
        String space = " "; // разбиение " " слов из строки
        byte[] spaceBytes = space.getBytes();

        try (outFile; bufferRead) {
            String line;
            while ((line = bufferRead.readLine()) != null) {
                String[] words = line.split(space);
                for (String word : words) { // проверка на палиндром
                    builder.append(word);
                    if (word.equals(builder.reverse().toString())) {
                        writeInFile(outFile, word, spaceBytes);
                    }
                    builder.setLength(0);
                }
            }
        }
    }

    private void writeInFile(BufferedOutputStream out, String word, byte[] spaceByte) throws IOException {
        out.write(word.getBytes());
        out.write(spaceByte);
    }
}
