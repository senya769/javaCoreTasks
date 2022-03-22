package arseniyusik.lesson5;

import java.util.Random;

/*
 * 7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
 * какой элемент является в этом массиве максимальным и сообщите индекс его
 * последнего вхождения в массив.
 */
public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] mass = new int[12];
        int index = 0;
        int max = mass[index];
        for (int i = 0; i < mass.length; i++){
            mass[i] = rand.nextInt(15);
            if (mass[i] > max){
                max = mass[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент в массиве = "+ max +" и посл. его индекс  = " + index);
    }
}
