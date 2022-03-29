package arseniyusik.lessonOOP.Person;

public class Person {
    private String fullName;
    private int age;

    Person(){}
    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;

    }
    public void move(){
    this.talk();
    }
    private void talk(){
        System.out.println(this.fullName + " говорит.");
    }

}
