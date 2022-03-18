package arseniyusik.lesson4;

public class Task5 {
    public static void main(String[] args) {
        double inch = 2.54;
        System.out.println("Дюймы\t Сантиметры");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "\t" + inch * i);
        }
    }
}
