package arseniyusik.lessonString.Task1;

import java.util.Scanner;

// 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
// последнего вхождения сивола(B).
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        // String line = new Scanner(System.in).nextLine();
        String line = "Hello, my name is Ron";
        System.out.println(line);
        StringBuilder build = new StringBuilder();
        System.out.println("Введите 1 символ");
        String firstElement = new Scanner(System.in).nextLine();
        System.out.println("Введите 2 символ");
        String secondElement = new Scanner(System.in).nextLine();
        build = new StringBuilder(build.substring(build.indexOf(firstElement), build.lastIndexOf(secondElement)+1));
        System.out.println(build);
    }
}
