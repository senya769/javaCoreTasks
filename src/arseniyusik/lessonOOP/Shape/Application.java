package arseniyusik.lessonOOP.Shape;

public class Application {
    public static void main(String[] args) {
        Shape array[] = new Shape[3];
        array[0] = new Circle(1, 2, "Red");
        array[1] = new Rectangle(2, 3, "Yellow");
        array[2] = new Rectangle(4, 5, "Orange");
        for (Shape j : array) {
            j.draw();
        }
    }
}
