package arseniyusik.lesson5;

import java.util.Random;

/*
 * 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
 * на экран в строку. Определить и вывести на экран сообщение о том, является ли
 * массив строго возрастающей последовательностью
 */
public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] mass = new int[4];
        boolean sub = true;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rand.nextInt(10);
        }
        System.out.println("Массив:");
        for (int j : mass) {
            System.out.print(j + " ");
        }
        for (int i = 1; i < mass.length; i++) {
            if (mass[i - 1] >= mass[i]) {
                sub = false;
                break;
            }
        }
        if (sub) {
            System.out.println(" - является строго возрастающей последовательностью");
        } else {
            System.out.println(" - не является строго возрастающей последовательностью");
        }
    }
}
