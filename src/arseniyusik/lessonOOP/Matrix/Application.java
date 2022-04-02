package arseniyusik.lessonOOP.Matrix;

public class Application {
    public static void main(String[] args) {
        Matrix arrayFirst = new Matrix(4, 4);
        Matrix arraySecond = new Matrix(4, 4);
        arrayFirst.showMatrix();
        arraySecond.showMatrix();
        arraySecond.sumMatrix(arrayFirst);
        arraySecond.showMatrix();
        arrayFirst.multiplyMatrix(-1);
        arrayFirst.showMatrix();
    }
}
