package arseniyusik.lessonOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Номер задания =  ");
        int tasks = new Scanner(System.in).nextInt();

        switch (tasks) {
            case 1:
                Phone obj1 = new Phone(1, "NULL");
                Phone obj2 = obj1;

                Phone Nokia = new Phone(1234, "Iphone");
                Nokia.receiveCall("Арсений", 4321);
                Nokia.getNumber();
                break;
            case 2:
                Person student = new Person();
                Person teacher = new Person("Pit", 41);
                teacher.move();
                break;
            case 3:
                Matrix arrayFirst = new Matrix(4, 4);
                Matrix arraySecond = new Matrix(4, 4);
                arrayFirst.showMatrix();
                arraySecond.showMatrix();
                arraySecond.sumMatrix(arrayFirst);
                arraySecond.showMatrix();
                arrayFirst.multiplyMatrix(-1);
                arrayFirst.showMatrix();
                break;
            case 4:
                Computer asus = new Computer("Intel Core i5", 8, 512, 3);
                asus.launchComputer();
                System.out.println(asus.showInfo());
                asus.turnOfComputer();
                System.out.println(asus.showInfo());
                break;
            case 5:
                Reader[] array = new Reader[3];
                array[0] = new Reader("ars",10,"FITY","28.04.2003",1234);
                array[1] = new Reader("roma",11,"FITY","10.11.2002",4321);
                array[0].takeBook("Приключение","Каникулы");
                array[0].returnBook("Приключение","Каникулы");
                System.out.println(array[0].getInfo());

                Book [] books = new Book[2];
                books[0] = new Book("Приключение","Васнецов");
                books[1] = new Book("Каникулы","Васильев");
                array[1].takeBook(books);
                array[1].returnBook(books);
                System.out.println(array[1].getInfo());
        }
    }
}
