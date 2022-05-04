package arseniyusik.lesson12_collections.task2_badStudents;

 class Student {
    //Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
    //Создать коллекцию, содержащую объекты класса Student.
    //Написать метод, который удаляет студентов со средним баллом <3.
    //Если средний балл>=3, студент переводится на следующий курс.
    //Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
    //А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
    private String name;
    private int group;
    private int course;
    private double averageMark;
    private String averageMarkText;

    public Student(String name, int group, int course, double averageMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageMark = averageMark;
        this.averageMarkText = String.format("%.3f",averageMark);
    }

    public int getCourse() {
        return course;
    }

     public double getAverageMark() {
         return averageMark;
     }

     public void setCourse(int course) {
         this.course = course;
     }

     @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", averageMark=" + averageMarkText +
                '}';
    }
}
