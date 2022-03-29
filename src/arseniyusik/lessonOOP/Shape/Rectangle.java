package arseniyusik.lessonOOP.Shape;

public class Rectangle extends Shape{
    private int x;
    private int y;
    Rectangle(int x, int y, String color){
        super(color);
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        System.out.println("Прямоугольник:  x = " + x + " y = " + y + " color = " + this.getColor());
    }
}
