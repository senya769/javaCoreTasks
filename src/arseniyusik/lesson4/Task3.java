package arseniyusik.lesson4;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
        }
        System.out.println("Результ вычисления 1+2+4+8+...+256 = " + sum);
    }
}
