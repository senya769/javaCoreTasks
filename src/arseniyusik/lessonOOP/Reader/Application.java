package arseniyusik.lessonOOP.Reader;

public class Application {
    public static void main(String[] args) {
        Reader[] array = new Reader[3];
        array[0] = new Reader("ars",10,"FITY","28.04.2003",1234);
        array[1] = new Reader("roma",11,"FITY","10.11.2002",4321);
        array[0].takeBook("Приключение","Каникулы");
        array[0].returnBook("Приключение","Каникулы");
        System.out.println(array[0].getInfo());

        Book[] books = new Book[2];
        books[0] = new Book("Приключение","Васнецов");
        books[1] = new Book("Каникулы","Васильев");
        array[1].takeBook(books);
        array[1].returnBook(books);
        System.out.println(array[1].getInfo());
    }
}
