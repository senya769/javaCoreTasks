package arseniyusik.lessonOOP.company.service;

import arseniyusik.lessonOOP.company.details.Engine;
import arseniyusik.lessonOOP.company.professions.Driver;
import arseniyusik.lessonOOP.company.vehicles.Car;
import arseniyusik.lessonOOP.company.vehicles.Lorry;
import arseniyusik.lessonOOP.company.vehicles.Sportcar;


public class Application {
    public static void main(String[] args) {
        Driver driver = new Driver("Васильев А.А.",40,10);
        Engine engine = new Engine(1000,"Volvo");

        Car[] cars = new Car[2];
    cars[0] = new Lorry("Lorry","DAF",5000,driver,engine,1000);
    cars[1] = new Sportcar("SporCar","BMW",1000,driver,engine,300);
    cars[0].printInfo();
    }
}
