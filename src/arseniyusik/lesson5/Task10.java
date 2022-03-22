package arseniyusik.lesson5;

import java.util.Random;
import java.util.Scanner;

/*
 * Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
 * переменную n. Если пользователь ввёл не подходящее число, то программа
 * должна выдать соответствующее сообщение. Создать массив из n случайных
 * целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
 * только из чётных элементов первого массива, если они там есть, и вывести его
 * на экран.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число большее 3: ");
        int size = scan.nextInt();
        int countEven = 0;
        if (size > 3) {
            int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(size);
                if (array[i] % 2 == 0) {
                    countEven++;
                }
            }
            int[] arrayResult = new int[countEven];

            System.out.println("Первый массив");
            for (int i = 0, j = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
                if (array[i] % 2 == 0) {
                    arrayResult[j] = array[i];
                    j++;
                }
            }
                System.out.println("\nНовый массив из четных элементов первого массива: ");
            for (int iter: arrayResult) {
                System.out.print(iter + " ");
            }
        } else {
            System.out.println("Вы ввели число меньшее 3, повторите ввод");
        }
    }
}
