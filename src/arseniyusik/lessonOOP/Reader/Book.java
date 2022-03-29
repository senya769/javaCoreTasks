package arseniyusik.lessonOOP.Reader;

public class Book {
    private String nameBook;
    private String nameAuthor;

    Book() {
    }

    Book(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    public void showInfo() {
        System.out.print("\'" + this.nameBook + " - " + nameAuthor + "\' ");
    }

}
