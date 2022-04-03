package arseniyusik.lessonOOP.Animals;

public class Cat extends Animal{
private int countMouse = 0;

    Cat(String food, String location, boolean healthy,int countMouse) {
        super(food, location, healthy);
        this.countMouse = countMouse;
    }


    @Override
    public void talk() {
        System.out.println("Мяууу");
    }

    @Override
    public void eat() {

        System.out.println("Еда кота - " + getFood() + ", локация - " + getLocation() + "\t\'словлено мышей " + countMouse);
    }
    public void infoHealthy() {
        String reference  = isHealthy() ? "Кот - здоров": "Кот - болен";
        System.out.println(reference);
    }
}
