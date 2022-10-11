package arseniyusik.examples.test2;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Artem"),
                new Student("Dima"),
                new Student("Lew")
        ));
        Gradebook gradebook = new Gradebook(studentList);
        for (int i = 1; i < 4; i++) {
           gradebook.setGradeStudent("Artem",i,5);
            gradebook.setGradeStudent("Dima", i, gradebook.getGradeOfTime());
            gradebook.setGradeStudent("Lew", i, gradebook.getGradeOfTime());
        }
        System.out.println(gradebook.getListStudentsByAverageMark(5));
    }
}
