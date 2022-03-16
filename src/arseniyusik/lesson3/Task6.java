package arseniyusik.lesson3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int valueOne = scan.nextInt();
        System.out.println("Enter the second number: ");
        int valueTwo = scan.nextInt();
        if(valueOne > valueTwo) System.out.println("higher number: "+ valueOne);
        else if (valueOne < valueTwo) System.out.println("higher number: "+ valueOne);
        else System.out.println("the numbers are equal");
    }
}
