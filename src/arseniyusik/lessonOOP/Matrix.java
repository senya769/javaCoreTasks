package arseniyusik.lessonOOP;

import java.util.Random;

public class Matrix {
    private int row;
    private int col;
    private double[][] array;

    Matrix() {
    }

    Matrix(int row, int col) {
        Random rand = new Random();
        this.row = row;
        this.col = col;
        array = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.array[i][j] = rand.nextInt(10);
            }
        }
    }

    public void showMatrix(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                System.out.print(this.array[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void sumMatrix(Matrix mass) {
        if (mass.row == this.row && mass.col == this.col) {
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    this.array[i][j] += mass.array[i][j];
                }
            }
        } else {
            System.out.println("Размер двух матриц не совпадает, а значит сложение не возможно!");
        }
    }
    public void multiplyMatrix(int number) {
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    this.array[i][j] *= number;
                }
            }
    }
}
