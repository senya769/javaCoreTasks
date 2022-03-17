package arseniyusik.lesson3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество людей:" );
        int amountOfHuman = scan.nextInt();
        String profession = "программист";
        if (amountOfHuman> 0 && amountOfHuman  < 5) profession += "а";
        else if (amountOfHuman >= 5 || amountOfHuman == 0) profession += "ов";
        else  if (amountOfHuman < 0) {System.out.println("Ошибка! Введите положительное число!"); return;}
        System.out.println(amountOfHuman + " " + profession);
        System.out.println("new");
    }
}
