package arseniyusik.lessonStreams.task1_filter;

public class People {
    private String name;
    private int age;
    private Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    public boolean findArmyAge() {
        if (this.sex == Sex.MAN) {
            return this.age >= 18 && this.age <= 27;
        }
        return false;
    }
}
