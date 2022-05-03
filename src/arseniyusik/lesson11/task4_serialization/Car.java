package arseniyusik.lesson11.task4_serialization;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private transient static int id = 0;
    private double speed;

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
        ++id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}' + ", id = " + id;
    }
}
