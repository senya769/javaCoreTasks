package arseniyusik.lesson11.task4_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ApplicationSerialization {
    public static void main(String[] args) {
        String directory = "D:\\учеба\\teachmeskills\\javaCoreTasks\\src\\arseniyusik\\lesson11\\task4_serialization\\";
        StringBuilder fileCar = new StringBuilder("fileCar.dat").insert(0,directory);
        File file = new File(fileCar.toString());
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileCar.toString()))) {
        if(file.createNewFile()){
            System.out.println("File is created!");
        }
            Car car = new Car("BMW", 31);
            System.out.println(car.toString());
            outputStream.writeObject(car);
        }  catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
