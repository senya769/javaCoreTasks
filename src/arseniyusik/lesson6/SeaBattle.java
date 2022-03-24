package arseniyusik.lesson6;

import java.util.Arrays;
import java.util.Random;

public class SeaBattle {
    public static void main(String[] args) {

        Random rand = new Random();

        char[][] place = new char[10][10];


        int col_id = rand.nextInt(10);
        int row_id = rand.nextInt(10);

        for (int i = 0; i < 10; i++) {// вывод  поля
            for (int j = 0; j < 10; j++) {
                place[i][j] = 'o';
            }
        }
int sizeSheep =4;
        int randomShipPosition = rand.nextInt(2);
        int temp = 0;
        switch (randomShipPosition) {
            case 0:  // горизонтальное положение
                insertPositionHorizotal(place,col_id,row_id,sizeSheep);
                break;
            case 1:
                insertPositionVertical(place,row_id,col_id,sizeSheep);

                break;
        }


        for (int i = 0; i < 10; i++) {// вывод поля в консоль
            for (int j = 0; j < 10; j++) {
                System.out.print(place[i][j] + " ");
            }
            System.out.println();
        }
    }


   public static void insertPositionHorizotal(char[][]place, int col_id, int row_id,int sizeShip){
           int temp = 0;

           while (temp < sizeShip) {
               if (col_id > 10 - sizeShip) {

                   for (int j = col_id; j < 10; j++) {
                       place[row_id][j] = 'X';
                       temp++;
                   }
               } else {
                   for (int j = col_id; j < col_id + sizeShip; j++) {
                       place[row_id][j] = 'X';
                       temp++;
                   }
               }
               if (temp < sizeShip) {
                   for (int i = 0; i < sizeShip - temp; i++) {
                       place[row_id][col_id - (sizeShip - temp) + i] = 'X';
                   }
                   temp++;
               }
           }
}
public static void insertPositionVertical(char[][]place, int col_id, int row_id,int sizeShip){
           int temp = 0;

           while (temp < sizeShip) {
               if (row_id > 10 - sizeShip) {

                   for (int j = row_id; j < 10; j++) {
                       place[j][col_id] = 'X';
                       temp++;
                   }
               } else {
                   for (int j = row_id; j < row_id + sizeShip; j++) {
                       place[j][col_id] = 'X';
                       temp++;
                   }
               }
               if (temp < sizeShip) {
                   for (int i = 0; i < sizeShip - temp; i++) {
                       place[row_id - (sizeShip - temp) + i][col_id] = 'X';
                   }
                   temp++;
               }
           }
}}



