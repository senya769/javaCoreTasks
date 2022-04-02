package arseniyusik.lessonOOP.company.professions;

public class Driver extends Person{

    private int experience;

    public Driver(){}
    public Driver(String fullName,int age, int experience) {
        super(fullName,age);
        this.experience = experience;
    }
    public void printInfo() {
        System.out.println("Водитель:\nФИО: " + getFullName() + ", возраст: "+ getAge() +
                 ", стаж: " + this.experience);

    }
}
