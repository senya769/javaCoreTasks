package arseniyusik.lesson10;

import java.util.Random;

public class Car {
    private String brand;
    private double speed;
    private double price;

    public Car() {
    }

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public void startEngine() throws EngineIsOff {
        int number = new Random().nextInt(20);
        if (number % 2 == 0) {
            throw new EngineIsOff(this);
        } else {
            System.out.println("Машина " + this.brand + " завелась!");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
