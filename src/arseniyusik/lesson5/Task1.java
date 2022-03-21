package arseniyusik.lesson5;
/*
 *   Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
 *   массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
 *   затем в столбик (отделяя один элемент от другого началом новой строки). Перед
 *   созданием массива подумайте, какого он будет размера.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        for (int i = 0, temp = 2; i < mass.length; i++, temp += 2) {
            mass[i] = temp;
        }
        // вывод через пробел в строку
        for (int j : mass) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
        // вывод в столбец
        for (int j : mass) {
            System.out.println(j);
        }
    }
}

