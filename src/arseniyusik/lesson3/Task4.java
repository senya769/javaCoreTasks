package arseniyusik.lesson3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int valueOne = scan.nextInt();
        int valueTwo = scan.nextInt();
        int valueThree = scan.nextInt();
        int temp = 0;
        if (valueOne > 0) temp++;
        if (valueTwo > 0) temp++;
        if (valueThree > 0) temp++;
        System.out.println("from a set of numbers " + temp + " positive number");
    }
}
