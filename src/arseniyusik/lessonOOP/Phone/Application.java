package arseniyusik.lessonOOP.Phone;

public class Application {
    public static void main(String[] args) {
        Phone obj1 = new Phone(1, "NULL");
        Phone obj2 = obj1;

        Phone Nokia = new Phone(1234, "Iphone");
        Nokia.receiveCall("Арсений", 4321);
        Nokia.getNumber();
    }
}
