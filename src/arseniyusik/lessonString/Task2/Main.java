package arseniyusik.lessonString.Task2;

import java.util.Scanner;

//  2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
//  позиции 0
public class Main {
    public static void main(String[] args) {
        int index = 3;
        int startIndex = 0;
        String line = new Scanner(System.in).nextLine();
        line.replace(line.charAt(index), line.charAt(startIndex));
        System.out.println( line.replace(line.charAt(index), line.charAt(startIndex)));

    }
}
