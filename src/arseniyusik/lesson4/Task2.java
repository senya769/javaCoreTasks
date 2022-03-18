package arseniyusik.lesson4;

public class Task2 {
    public static void main(String[] args) {
        int amountAmoeba = 1;
        int hours = 3;
        for (int i = hours; i < 24; i += 3) {
            amountAmoeba *= 2;
            System.out.println("Количество амеб за " + i + " часов равно " + amountAmoeba);
        }
    }
}
