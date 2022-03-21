package arseniyusik.lesson5;

import java.util.Random;

/*
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
 * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
 * арифметическое элементов каждого массива и сообщите, для какого из
 * массивов это значение оказалось больше (либо сообщите, что их средние
 * арифметические равны).
 */
public class Task5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] massFirst = new int[5];
        int[] massSecond = new int[5];
        double averageFirst = 0, averageSecond = 0;
        for (int i = 0; i < massFirst.length; i++) {
            massFirst[i] = rand.nextInt(15);
            averageFirst += massFirst[i];
            massSecond[i] = rand.nextInt(15);
            averageSecond += massSecond[i];
        }
        // вычисление ср. арифмет. для двух массивов
        averageFirst /= massFirst.length;
        averageSecond /= massSecond.length;
        // вывод массивов
        System.out.println("Первый массив:");
        for (int j : massFirst) {
            System.out.print(j + " ");
        }
        System.out.println("\nВторой массив:");
        for (int j : massSecond) {
            System.out.print(j + " ");
        }
        System.out.println();
        // сравнение ср. арифмет. чисел между собой
        if (averageFirst  > averageSecond ) {
            System.out.println("Среднее арифмет. число 1-го массива [" + averageFirst +
                    "] оказалось больше, чем 2-го [" + averageSecond + "].");
        }
        else if (averageFirst  < averageSecond ) {
            System.out.println("Среднее арифмет. число 1-го массива [" + averageFirst +
                    "] оказалось меньше, чем 2-го [" + averageSecond + "].");
        } else {
            System.out.println("Средние арифмет. числа между собой равны " +
                    "(" + averageFirst + " = " + averageSecond + ")");
        }
    }
}
