package arseniyusik.lessonOOP.company.vehicles;

import arseniyusik.lessonOOP.company.details.Engine;
import arseniyusik.lessonOOP.company.professions.Driver;

public class Lorry extends Car{
    private int carrying;

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carClass, String brand, int weight, Driver driver, Engine engine, int carrying) {
        super(carClass, brand, weight, driver, engine);
        this.carrying = carrying;
    }
}
