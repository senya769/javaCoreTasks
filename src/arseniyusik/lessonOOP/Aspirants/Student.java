package arseniyusik.lessonOOP.Aspirants;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        return this.averageMark == 5 ? 100 : 80;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }
}
