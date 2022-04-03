package arseniyusik.lessonOOP.Animals;

public abstract class Animal {
    private String food;
    private String location;
    private boolean healthy;
    public static int count = 0;

    Animal(String food, String location, boolean healthy) {
        this.food = food;
        this.location = location;
        this.healthy = healthy;
    }

    public boolean isHealthy() {
        return healthy;
    }
    public void setHealthy(){
        System.out.println("Лечение...");
        this.healthy = true;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public abstract void talk();
    public abstract void eat();
    public abstract void infoHealthy();
}
