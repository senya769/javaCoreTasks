package arseniyusik.lessonOOP.tasksEnum.Clothes;

public class Trousers extends Clothes implements WomanClothing,MenClothing {

    public Trousers(SizeClothes sizeClothes, double price, String color) {
        super(sizeClothes, price, color);
    }

    @Override
    public void putOnMan() {
        System.out.println("Мужские штаны:\n" + "Цена " + this.getPrice() +"\nЦвет " + this.getColor() +
                "\nРазмер " + getSizeClothes());
    }

    @Override
    public void putOnWoman() {
        System.out.println("Женские штаны:\n" + "Цена " + this.getPrice() +"\nЦвет " + this.getColor() +
                "\nРазмер " + getSizeClothes());
    }
}
