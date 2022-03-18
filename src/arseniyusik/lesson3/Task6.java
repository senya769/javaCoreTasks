package arseniyusik.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите первое число диапозона ");
        int first = scan.nextInt();
        System.out.println("Введите второе число диапозона ");
        int second = scan.nextInt();
        int valueOne = rand.nextInt(second - first + 1) + first;
        int valueTwo = rand.nextInt(second - first + 1) + first;
        if(valueOne > valueTwo) System.out.println("Большее число: "+ valueOne);
        else if (valueOne < valueTwo) System.out.println("Большее число: "+ valueTwo);
        else System.out.println("Числа одинаковы");
    }
}
