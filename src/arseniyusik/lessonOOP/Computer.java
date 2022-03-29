package arseniyusik.lessonOOP;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String CPU;
    private int RAM;
    private int HDD;
    private int resource;
    private boolean status = false;
    private int count = 0;

Computer(){}
Computer(int resource){
    this.resource = resource;
}
public Computer(String CPU, int RAM, int HDD, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resource = resource;
    }


    public String showInfo() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                ", resource=" + resource +
                ", Есть неисправность ПК = " + status +
                '}';
    }

    public void launchComputer(){
        int randNumber = new Random().nextInt(2);
        System.out.println("Введите число 0 или 1, чтобы включить ПК");
        int inputNumber = new Scanner(System.in).nextInt();
        if(randNumber == inputNumber && count <= resource && !status){
            System.out.println("Ваш Компьютер включен!");
        }
        else{
            this.status = true;
            System.out.println("Ошибка! Ваш Компьютер сгорел!");
        }
        this.count++;
    }
    public void turnOfComputer(){
        int randNumber = new Random().nextInt(2);
        System.out.println("Введите число 0 или 1, чтобы выключить ПК");
        int inputNumber = new Scanner(System.in).nextInt();
        if(randNumber == inputNumber && count <= resource && !status){
            System.out.println("Ваш Компьютер выключен!");
        }
        else{
            this.status = true;
            System.out.println("Ошибка! Ваш Компьютер сгорел!");
        }
        this.count++;
    }

}
