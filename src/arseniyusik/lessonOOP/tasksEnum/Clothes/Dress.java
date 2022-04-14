package arseniyusik.lessonOOP.tasksEnum.Clothes;

public class Dress extends Clothes implements WomanClothing{
    public Dress(SizeClothes sizeClothes, double price, String color) {
        super(sizeClothes, price, color);
    }

    @Override
    public void putOnMan() {

    }

    @Override
    public void putOnWoman() {
        System.out.println("Юбка:\n" + "Цена " + this.getPrice() +"\nЦвет " + this.getColor() +
                "\nРазмер " + getSizeClothes());
    }
}
