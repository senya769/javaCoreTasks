package arseniyusik.lessonOOP.Animals;

public class Horse extends Animal{
private int countHorseShoe;

    Horse(String food, String location, boolean healthy,int countHorseShoe) {
        super(food, location, healthy);
        this.countHorseShoe = countHorseShoe;
    }

    @Override
    public void talk() {
        System.out.println("Б-р-р-р-р");
    }

    @Override
    public void eat() {
        System.out.println("Еда лошади - " + getFood() + ", локация - " + getLocation()+"\t\'кол-во надетых подков " + countHorseShoe);
    }
    public void infoHealthy() {
        String reference  = isHealthy() ? "Лошадь - здорова ": "Лошадь - больна";
        System.out.println(reference);
    }
}
