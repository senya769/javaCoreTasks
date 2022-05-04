package arseniyusik.lesson12_collections.task1_students;

import java.io.*;
import java.util.*;

public class ApplicationMain {
    public static void main(String[] args)  {
        StudentHelper studentHelper = new StudentHelper();
        for (int i = 0; i < 10; i++) {
            studentHelper.addRandomStudent();
        }
        studentHelper.displayStudents();
        switch (StudentHelper.menu()) {
            case 1:
                studentHelper.addRandomStudent();
                break;
            case 2:
                System.out.println("Укажите ID");
                int idDelete = new Scanner(System.in).nextInt();
                studentHelper.removeID(idDelete);
                break;
            case 3:
                System.out.println("Укажите ID");
                int idSet = new Scanner(System.in).nextInt();
                studentHelper.setStudent(idSet);
                break;
            case 4:
                Comparator<Student> comparator = new StudentComparatorName().thenComparing(new StudentComparatorAge());
                studentHelper.students.sort(comparator);
                break;
            case 5:
                // уникальные обьекты
                break;
        }
        studentHelper.displayStudents();
    }

    public static String[] toArray(String dir) {
        String[] array = new String[0];
        try (BufferedReader bufferInput = new BufferedReader(new FileReader(dir))) {
            String line;
            while ((line = bufferInput.readLine()) != null) {
                array = line.split(" ");
            }
        } catch (FileNotFoundException foundException) {
            foundException.printStackTrace();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return array;
    }
}
