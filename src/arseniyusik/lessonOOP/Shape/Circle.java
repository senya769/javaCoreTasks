package arseniyusik.lessonOOP.Shape;

public class Circle extends Shape{
    private int x;
    private int y;

    Circle(){}
    Circle(int x, int y, String color){
        super(color);
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw() {
        System.out.println("Круг:  x = " + x + " y = " + y + " color = " + this.getColor());
    }
}
