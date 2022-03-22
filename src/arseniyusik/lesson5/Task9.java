package arseniyusik.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * 9)Пользователь должен указать с клавиатуры положительное число, а
 * программа должна создать массив указанного размера из случайных целых
 * чисел из [0;15] и вывести его на экран в строку. После этого программа должна
 * определить и сообщить пользователю о том, сумма какой половины массива
 * больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
 * пользователь введёт неподходящее число, то выдать соответствующее
 * сообщение
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        if (size > 0) {
            int[] mass = new int[size];

            for (int i = 0; i < mass.length; i++) {
                mass[i] = rand.nextInt(15);
            }

            for (int j : mass) {
                System.out.print(j + " ");
            }

            int sumRight = 0, sumLeft = 0;

            for (int i = 0; i < mass.length; i++) {
                if (mass.length / 2 > i) {
                    sumLeft += mass[i];
                } else {
                    sumRight += mass[i];
                }
            }
            if (sumLeft > sumRight) {
                System.out.println("\nСумма левой части массива больше, чем правая");
            } else if (sumRight > sumLeft) {

                System.out.println("\nСумма правой части массива больше, чем левая");
            } else {
                System.out.println("\nСуммы обеих частей массива равны между собой ");
            }
        } else {
            System.out.println("Введите корректный размер массива");
        }
    }
}
