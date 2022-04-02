package arseniyusik.lessonOOP.company.professions;

public class Person {
    private String fullName;
    private int age;

    public Person(){}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
