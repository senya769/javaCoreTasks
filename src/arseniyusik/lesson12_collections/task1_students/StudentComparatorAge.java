package arseniyusik.lesson12_collections.task1_students;

import java.util.Comparator;

public class StudentComparatorAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
