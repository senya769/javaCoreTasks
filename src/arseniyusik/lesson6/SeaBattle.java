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

        int randomShipPosition = rand.nextInt(2);
        int temp = 0;
        switch (randomShipPosition) {
            case 0:  // горизонтальное положение
                while (temp < 4) {
                    if (col_id > 6) {
                        for (int j = col_id; j < 10; j++) {
                            place[row_id][j] = 'X';
                            temp++;
                        }
                    } else {
                        for (int j = col_id; j < col_id + 4; j++) {
                            place[row_id][j] = 'X';
                            temp++;
                        }
                    }
                    if (temp < 4) {
                        for (int i = 0; i < 4 - temp; i++) {
                            place[row_id][col_id - (4 - temp) + i] = 'X';
                        }
                        temp++;
                    } else {
                        break;
                    }
                }
                break;
            case 1:
                while (temp < 4) {
                    if (row_id > 6) {

                        for (int j = row_id; j < 10; j++) {
                            place[j][col_id] = 'X';
                            temp++;
                        }
                    } else {
                        for (int j = row_id; j < row_id + 4; j++) {
                            place[j][col_id] = 'X';
                            temp++;
                        }
                    }
                    if (temp < 4) {
                        for (int i = 0; i < 4 - temp; i++) {
                            place[row_id - (4 - temp) + i][col_id] = 'X';
                        }
                        temp++;
                    }
                }
                break;
        }


        for (int i = 0; i < 10; i++) {// вывод поля в консоль
            for (int j = 0; j < 10; j++) {
                System.out.print(place[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
   public void insertHorizontalPosition(char[][]place, int col_id, int row_id){
        int temp = 0;

        while (col_id < 10) {
            if (col_id > 6) {

                for (int j = col_id; j < 10; j++) {
                    place[row_id][j] = 'X';
                    temp++;
                }
            } else {
                for (int j = col_id; j < col_id + 4; j++) {
                    place[row_id][j] = 'X';
                    temp++;
                }
            }
            if (temp < 4) {
                for (int i = 0; i < 4 - temp; i++) {
                    place[row_id][col_id - (4 - temp) + i] = 'X';
                }
                temp++;
            } else {
                break;
            }
        }
}}

* */
