package arseniyusik.lesson10;

public class ApplicationStartCar {
    public static void main(String[] args) {
        Car[] cars = new Car[2];
        cars[0] = new Car("Mazda", 100, 200.1);
        cars[1] = new Car("BMW", 200, 900.15);

        for (Car j : cars) {
            try {
                j.startEngine();
            } catch (EngineIsOff engineIsOff) {
                engineIsOff.engineTurnOff();
            }
        }
    }
}
