package arseniyusik.lessonOOP.tasksEnum.Clothes;

public class TShirt extends Clothes implements WomanClothing,MenClothing{

    public TShirt(SizeClothes sizeClothes, double price, String color) {
        super(sizeClothes, price, color);
    }

    @Override
    public void putOnMan() {
        System.out.println("Мужская майка:\n" + "Цена " + this.getPrice() +"\nЦвет " + this.getColor() +
                "\nРазмер " + getSizeClothes());
    }

    @Override
    public void putOnWoman() {
        System.out.println("Женская майка:\n" + "Цена " + this.getPrice() +"\nЦвет " + this.getColor() +
                "\nРазмер " + getSizeClothes());
    }
}
