package arseniyusik.lessonOOP.Animals;

public class Vet {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void treatAnimal(Animal animal){
            animal.infoHealthy();
            animal.eat();
            while (!animal.isHealthy()){

            animal.talk();
            animal.setHealthy();
            animal.infoHealthy();
            }
    }

}
