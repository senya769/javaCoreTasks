package arseniyusik.lesson11.task4_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ImplementationCar {
    public static void main(String[] args) {
        String directory = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\task4_serialization\\";
        StringBuilder fileCar = new StringBuilder("fileCar.dat").insert(0,directory);
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileCar.toString()))){
            Car car = (Car) inputStream.readObject();
            System.out.println(car.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
