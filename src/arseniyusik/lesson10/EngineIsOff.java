package arseniyusik.lesson10;

public class EngineIsOff extends Exception {
    // int detail;
    private final Car detail;

    public EngineIsOff(Car detail) {
        this.detail = detail;
    }

    /*  public EngineIsOff(int detail) {
            this.detail = detail;
        }*/
    public void engineTurnOff() {
        System.out.print("Ошибка! - ");
        System.out.println("Машина " + this.detail.getBrand() + " не завелась!");
        System.out.println("___________________________________________________");
        System.out.println("Log:\n Марка" + this.detail.getBrand() + "\tЦена = " +
               + this.detail.getPrice() + "\tСкорость = " + this.detail.getSpeed());
        System.out.println("___________________________________________________");
    }
}
