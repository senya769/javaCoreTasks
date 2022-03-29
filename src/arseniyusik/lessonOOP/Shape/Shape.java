package arseniyusik.lessonOOP.Shape;

public abstract class Shape {
    private String color;
    Shape(){}
Shape(String color){
    this.color = color;
}

    public String getColor() {
        return color;
    }

    public Shape setColor(String color) {
        this.color = color;
        return this;
    }

    public abstract void draw();
}
