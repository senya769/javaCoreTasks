package arseniyusik.lessonOOP.tasksEnum.Clothes;

public class Tie extends Clothes implements MenClothing {

    public Tie(SizeClothes sizeClothes, double price, String color) {
        super(sizeClothes, price, color);
    }

    @Override
    public void putOnMan() {
        System.out.println("Галстук:\n" + "Цена " + this.getPrice() +"\nЦвет " + this.getColor() +
                "\nРазмер " + getSizeClothes());
    }

    @Override
    public void putOnWoman() {

    }
}
