package arseniyusik.lessonOOP.Computer;

public class Application {
    public static void main(String[] args) {
        Computer asus = new Computer("Intel Core i5", 8, 512, 3);
        asus.launchComputer();
        System.out.println(asus.showInfo());
        asus.turnOfComputer();
        System.out.println(asus.showInfo());
    }
}
