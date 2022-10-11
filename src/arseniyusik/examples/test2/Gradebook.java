package arseniyusik.examples.test2;


import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

//Реализовать класс “Журнал успеваемости”. В конструктор передать список фамилий студентов. Реализовать методы:

public class Gradebook {
    private final List<Student> studentList;

    public Gradebook(List<Student> studentList) {
        this.studentList = studentList;
    }
    //выставления оценки студенту. принимает на вход фамилию студента, номер занятия и оценку
    synchronized public void setGradeStudent(String fam, int numberLesson, int grade) {
        Student st = this.studentList.stream().
                filter(student -> Objects.equals(student.getFam(), fam))
                .findFirst()
                .map(student -> student.addGrade(numberLesson, grade)).orElse(null);
       for(int i =0;i<studentList.size();i++) {
           if (st!=null &&Objects.equals(studentList.get(i).getFam(), st.getFam())) {
               studentList.set(i,st);
               return;
           }
       }
    }
//получения оценки студента за некоторое занятие. принимает на вход фамилию студента и номер занятия. возвращает оценку

    public int getGradeOfTime() {
        return new Random().nextInt(10)+1;
    }
//получения среднего балла студента. принимает на вход фамилию, возвращает средний балл

   synchronized public double getAverageMark(String fam) {
        return studentList.stream()
                .filter(student -> Objects.equals(student.getFam(), fam))
                .findFirst()
                .map(Student::getAverageMark).orElse(0.0);
    }
//получение списка фамилий студентов, средний балл которых выше или равен заданному
    synchronized public List<Student> getListStudentsByAverageMark(double averageMark) {

        return studentList.stream()
                .filter(student -> student.getAverageMark() >= averageMark)
                .collect(Collectors.toList());
    }
//добавления нового студента
    public void addStudent(Student student) {
        this.studentList.add(student);
    }
}

