package arseniyusik.lesson10;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class ApplicationStartCar {
    public static void main(String[] args) {
        PrintStream stream = new PrintStream(System.out);
        Car[] cars = new Car[2];
        cars[0] = new Car("Mazda", 100, 200.1);
        cars[1] = new Car("BMW", 200, 900.15);

        for (Car j : cars) {
            try {
               stream.println(j.startEngine());
            } catch (EngineIsOff engineIsOff) {
               stream.println(engineIsOff.engineTurnOff());
            }
        }
    }
}
