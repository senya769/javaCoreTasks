package arseniyusik.lesson12_collections.task2_badStudents;

import java.util.*;

public class ApplicationMain {
    public static void main(String[] args) {
        String []names = new String[]{"Anton","Vanya","Alex","Tom","Xoll"};

        List<Student> listStudents = new ArrayList<>();
        Student []arrayStudents = new Student[5];
        for (int i = 0; i < 5; i++){
            listStudents.add(new Student(names[new Random().nextInt(5)],
                    new Random().nextInt(5) + 600,
                    new Random().nextInt(4) + 1,
                    new Random().nextDouble(5) + 1));
        }
        displayStudents(listStudents);

        System.out.println("Список студентов студентов зачисленых на след курс!");
        removeBadStudent(listStudents);
        displayStudents(listStudents);
        System.out.print("Введите курс, чтобы получить спискок зачисленных - ");
        int course = new Scanner(System.in).nextInt();
        printStudents(listStudents,course);
    }
    public static void removeBadStudent(List<Student> students){
        Iterator<Student> studIterator = students.iterator();
        while (studIterator.hasNext()) {
            Student stud = studIterator.next();
            if (stud.getAverageMark() < 3) {
                studIterator.remove();
            }
            else {
                stud.setCourse(stud.getCourse()+1);
            }
        }
    }
    public static void printStudents(List<Student> students, int course){
        Iterator<Student> studIterator = students.iterator();
        while (studIterator.hasNext()) {
            Student stud = studIterator.next();
            if (stud.getCourse() != course) {
                studIterator.remove();
            }
        }
        StringBuilder builder = new StringBuilder("Кол-во студентов обучающихся на ").append(course)
                .append(" курсе = ").append(students.size());
        System.out.println(builder);
        displayStudents(students);

    }
    public static void displayStudents(List<Student> studs){
        for (Student student : studs){
            System.out.println(student.toString());
        }
    }
}
