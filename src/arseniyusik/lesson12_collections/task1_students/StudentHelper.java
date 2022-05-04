package arseniyusik.lesson12_collections.task1_students;

import java.util.*;

import static arseniyusik.lesson12_collections.task1_students.ApplicationMain.toArray;

public class StudentHelper {
    private final String dirNames = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson12_collections\\task1_students\\names.txt";
    private final String dirFaculty = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson12_collections\\task1_students\\faculty.txt";
    private final String[] arrayNames = toArray(dirNames);
    private final String[] arrayFaculty = toArray(dirFaculty);
    public List<Student> students = new ArrayList<>();

    public static int menu() {
        StringBuilder builder = new StringBuilder("\tМENU\n");
        builder.append("1 - добавление нового студента в список\n")
                .append("2 - удаление студента из списка по id\n")
                .append("3 - редактирование студента по id\n")
                .append("4 - получить всех студентов в отсортированном виде по имени и возрасту\n")
                .append("5 - получить все уникальные факультеты и имена студентов и их возраст на этом факультете\n")
                .append("Выберите операцию - ");
        System.out.print(builder);
        return new Scanner(System.in).nextInt();
    }

    public void addRandomStudent() {
        students.add(new Student(new Random().nextInt(4) + 1,
                new Random().nextInt(4) + 18,
                arrayNames[new Random().nextInt(arrayNames.length)],
                arrayFaculty[new Random().nextInt(arrayFaculty.length)]));
    }

    public void removeID(int idDelete) {
        Iterator<Student> studIterator = students.iterator();
        while (studIterator.hasNext()) {
            Student stud = studIterator.next();
            if (stud.getId() == idDelete) {
                studIterator.remove();
            }
        }
    }

    public void displayStudents() {
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public void setStudent(int idSet) {
        Iterator<Student> studIterator = students.iterator();
        while (studIterator.hasNext()) {
            Student stud = studIterator.next();
            if (stud.getId() == idSet) {
                System.out.println("Введите имя");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Введите возраст");
                int age = new Scanner(System.in).nextInt();
                System.out.println("Введите курс");
                int course = new Scanner(System.in).nextInt();
                System.out.println("Введите факультет");
                String faculty = new Scanner(System.in).nextLine();
                stud.setName(name);
                stud.setAge(age);
                stud.setCourse(course);
                stud.setFaculty(faculty);
            }
        }
    }
}