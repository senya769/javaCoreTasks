package arseniyusik.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = 1;
        double distance = 10;
        for (int i = day;i <= 7; i++){
            distance += distance*0.1;
        }
        System.out.println(distance);
    }
}
