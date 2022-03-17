package arseniyusik.lesson3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество людей:");
        int amountOfHuman = scan.nextInt();
        int amountEnd10 = amountOfHuman % 10;
        int amountEnd100 = amountOfHuman % 100;
        String profession = "программист";
        if (amountEnd100 >= 5 && amountEnd100 <= 20) profession += "ов";
        else if (amountEnd10 > 1 && amountEnd10 < 5) profession += "а";
        else if (amountEnd10 == 1) { profession +="";
        } else profession += "ов";
        System.out.println(amountOfHuman + " " + profession);
    }
}
