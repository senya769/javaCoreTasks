package arseniyusik.lesson5;

import java.util.Random;
import java.util.Scanner;

/*
 * Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
 * массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
 * массива должен равняться отношению элемента из первого массива с i-ым
 * индексом к элементу из второго массива с i-ым индексом. Вывести все три
 * массива на экран (каждый на отдельной строке), затем вывести количество
 * целых элементов в третьем массиве.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int[] randFirst = new int[10];
        int[] randSecond = new int[10];
        double[] mass = new double[10];
        for (int i = 0; i < randFirst.length; i++) {
            randFirst[i] = rand.nextInt(9);
            randSecond[i] = rand.nextInt(8) + 1;
            mass[i] = (double) randFirst[i] / randSecond[i];
        }
        System.out.println("Первый массив:");
        for (int j : randFirst) {
            System.out.print(j + " ");
        }
        System.out.println("\nВторой массив:");
        for (int j : randSecond) {
            System.out.print(j + " ");
        }
        int count = 0;
        System.out.println("\n Массив  результата:");
        for (double j : mass) {
            System.out.print(j + " ");
            if (j % 1 == 0){
                count++;
            }
        }
        System.out.println("\nЦелых чисел в послднем массиве  = " + count);
    }
}
