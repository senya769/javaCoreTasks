package arseniyusik.lessonOOP.Printable;

public class ApplicationInterface {
    public static void main(String[] args) {
        Printable [] array = new Printable[3];
        array[0] = new Book("Приключение");
        array[1] = new Magazine("Комета");
        array[2] = new Magazine("Звезда");
        for (Printable j : array) {
            j.print();
        }
        Book.printBooks(array);
        Magazine.printMagazines(array);
    }
}
