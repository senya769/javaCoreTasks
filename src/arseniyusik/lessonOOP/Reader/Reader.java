package arseniyusik.lessonOOP.Reader;

public class Reader {
    private String fullName;
    private int cardNumber;
    private String faculty;
    private String date;
    private int phoneNumber;

    Reader(){}

    public Reader(String fullName, int cardNumber, String faculty, String date, int phoneNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.date = date;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count){
        System.out.print(this.fullName + " взял " + count + " книг(и): ");
    }
    public void takeBook(String ...namesBooks){
       // System.out.print(this.fullName + " взял книги: ");
        takeBook(namesBooks.length);
        for (String i : namesBooks){
            System.out.print("'"+ i +"' ");
        }
        System.out.println();
    }
    public void takeBook(Book...books){
        //System.out.print(this.fullName + " взял книги: ");
        takeBook(books.length);
        for (Book j : books){
            j.showInfo();
        }
        System.out.println();
    }
    public void returnBook(int count) {
        System.out.print(this.fullName + " вернул " + count + " книг(и): ");
    }

    public void returnBook(String ...namesBooks) {
        returnBook(namesBooks.length);
        for (String i : namesBooks){
            System.out.print("'"+ i +"' ");
        }
        System.out.println();
    }
    public void returnBook(Book...books){
        returnBook(books.length);
        for (Book j : books){
            j.showInfo();
        }
        System.out.println();
    }

    public String getInfo() {
        return "Reader{" +
                "Полное имя '" + fullName + '\'' +
                ", номер студенческого билета '"  + cardNumber +
                ", факульет '" + faculty + '\'' +
                ", дата Рождения '" + date + '\'' +
                ", номер телефона '" + phoneNumber +
                "'}";
    }
}
