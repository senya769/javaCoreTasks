package arseniyusik.lessonOOP.Printable;

public class Magazine implements Printable{
    private String name;

    public Magazine(){}
    public Magazine(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Журнал \"" + this.name +  "\" печатается...");
    }
    public static void printMagazines(Printable[] printable){
        for (Printable j : printable) {
            if(j instanceof Magazine){
                j.print();
            }
        }
    }
}
