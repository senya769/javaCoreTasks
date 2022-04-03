package arseniyusik.lessonOOP.Animals;

public class Dog extends Animal {
    private int chainTime;

    Dog(String food, String location, boolean healthy,int chainTime) {
        super(food, location, healthy);
        this.chainTime = chainTime;
    }


    @Override
    public void talk() {
        System.out.println("Гав - гав!");
    }

    @Override
    public void eat() {
        System.out.println("Еда собаки - " + getFood() + ", локация - " + getLocation() + "\t\'время без цепи " + chainTime);
    }
    public void infoHealthy() {
        String reference  = isHealthy() ? "Собака - здорова ": "Собака - больна";
        System.out.println(reference);
    }
}
