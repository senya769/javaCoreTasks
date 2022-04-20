package arseniyusik.lessonOOP.tasksEnum.Clothes;

public abstract class Clothes {
    private SizeClothes sizeClothes;
    private double price;
    private String color;

    public Clothes(SizeClothes sizeClothes, double price, String color) {
        this.sizeClothes = sizeClothes;
        this.price = price;
        this.color = color;
    }

    public SizeClothes getSizeClothes() {
        return sizeClothes;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    public abstract void putOnMan();
    public abstract void putOnWoman();
}

