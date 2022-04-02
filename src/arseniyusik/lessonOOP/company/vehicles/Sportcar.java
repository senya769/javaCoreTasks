package arseniyusik.lessonOOP.company.vehicles;

import arseniyusik.lessonOOP.company.details.Engine;
import arseniyusik.lessonOOP.company.professions.Driver;

public class Sportcar extends Car{
    private int speed;

    public Sportcar(int speed) {
        this.speed = speed;
    }

    public Sportcar(String carClass, String brand, int weight, Driver driver, Engine engine, int speed) {
        super(carClass, brand, weight, driver, engine);
        this.speed = speed;
    }
}
