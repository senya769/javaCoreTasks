package arseniyusik.lessonOOP.Printable;


public class Book implements Printable {
    private String name;

    Book(){}
    Book(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("Книга \"" + this.name +"\" печатается ...");
    }
    public static void  printBooks(Printable []printable){
        for (Printable j : printable) {
            if(j instanceof Book){
                j.print();
            }
        }
    }
}
