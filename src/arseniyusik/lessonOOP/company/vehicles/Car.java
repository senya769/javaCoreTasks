package arseniyusik.lessonOOP.company.vehicles;

import arseniyusik.lessonOOP.company.details.Engine;
import arseniyusik.lessonOOP.company.service.Movement;
import arseniyusik.lessonOOP.company.professions.Driver;

public abstract class Car implements Movement {
    private String carClass;
    private String brand;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(){}
    public Car(String carClass, String brand, int weight, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.brand = brand;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
   public void start(){
       System.out.printf("Поехали!");
   }
    public void stop(){
        System.out.printf("Останавливаемся!");
    }
    public void turnRight(){
        System.out.printf("Поворот направо!");
    }
    public void turnLeft(){
        System.out.printf("Поворот налево!");
    }

    public void printInfo() {
        System.out.println("Класс авто: " + this.carClass + ", марка: "  + this.brand + ", вес: " + this.weight );
        driver.printInfo();
        engine.printInfo();
    }
}
