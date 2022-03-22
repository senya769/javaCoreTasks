package arseniyusik.lesson5;
/*
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
 * строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
 * порядке (99 97 95 93 ... 7 5 3 1).
 */

public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[50];
        for (int i = 0, temp = 1; i < mass.length; i++, temp += 2) {
            mass[i] = temp;
        }
        // вывод через пробел в строку
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
        // вывод через пробел в строку в обратном порядке
        for (int i = mass.length-1;i >= 0;i--) {
            System.out.print(mass[i] + " ");
        }

    }
}
