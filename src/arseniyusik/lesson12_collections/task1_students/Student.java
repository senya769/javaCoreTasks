package arseniyusik.lesson12_collections.task1_students;

import java.util.Objects;

 class Student implements Comparable<Student>{
    private static int count = 20600;
    private int id = ++count;
    private int course;
    private int age;
    private String name;
    private String faculty;

    public Student(int course, int age, String name, String faculty) {
        this.course = course;
        this.age = age;
        this.name = name;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public int getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void displayInfo(){
        System.out.println( "Student{" + "id = "+ id+
                ", course=" + course +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                '}');
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
