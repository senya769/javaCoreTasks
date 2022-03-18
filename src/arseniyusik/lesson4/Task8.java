package arseniyusik.lesson4;

public class Task8 {
    public static void main(String[] args) {
        char element = '*';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(element);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 4; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(element);
            }
            System.out.println();
        }

    }
}
