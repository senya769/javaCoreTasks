package arseniyusik.lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int valueOne = scan.nextInt();
        int valueTwo = scan.nextInt();
        int valueThree = scan.nextInt();
        int tempPoz = 0, tempNeg = 0, temp;
        temp = valueOne > 0 ? tempPoz++ : tempNeg++;
        temp = valueTwo > 0 ? tempPoz++ : tempNeg++;
        temp = valueThree > 0 ? tempPoz++ : tempNeg++;
        System.out.println("from a set of numbers " + tempPoz + " positive and " + tempNeg + " negative numbers");
    }
}
