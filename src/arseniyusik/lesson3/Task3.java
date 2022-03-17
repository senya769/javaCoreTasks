package arseniyusik.lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int valueInt = scan.nextInt();
        if (valueInt > 0) {
            valueInt++;
        } else if (valueInt < 0) {
            valueInt -= 2;
        } else {
            valueInt = 10;
        }
        System.out.println("The number has become " + valueInt);
    }
}
