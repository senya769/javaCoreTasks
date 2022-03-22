package arseniyusik.lesson5;

import java.util.Random;

/*
 * Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
 * массив на экран в строку. Замените каждый элемент с нечётным индексом на
 * ноль. Снова выведете массив на экран на отдельной строке.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[20];
        Random rand = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(20);
            System.out.print(mass[i] + " ");
            if (i % 2 != 0) {
                mass[i] = 0;
            }
        }
        System.out.println();
        for (int j : mass) {
            System.out.print(j + " ");
        }
    }
}
