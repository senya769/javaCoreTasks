package arseniyusik.lesson4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int min = A > B ? B : A;
        int max = A < B ? B : A;
        int result = 0;
        while (min != 0) {
            result += max;
            min--;
        }
        System.out.println(A + " * " + B + " = " + result);
    }
}
