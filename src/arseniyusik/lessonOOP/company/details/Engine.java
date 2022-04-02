package arseniyusik.lessonOOP.company.details;

public class Engine {
    private int power;
    private String company;
    Engine(){}

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }
    public void printInfo() {
        System.out.println("Двигатель : \nКомпания: " + this.company + ", мощность: " + this.power);
    }
}
