package arseniyusik.lesson5;

import java.util.Random;

/*
 * Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
 * массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
 * это количество на экран на отдельной строке.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int count = 0;
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(100);
        }
        for (int j : mass) {
            System.out.print(j + " ");
            if (j % 2 == 0) {
                count++;
            }
        }
        System.out.println("\nКол-во четных элементов в массиве = " + count);
    }
}
