package arseniyusik.lesson10;

public class EngineIsOff extends Exception {
    private final Car detail;

    public EngineIsOff(Car detail) {
        this.detail = detail;
    }

    public StringBuilder engineTurnOff() {
        StringBuilder strBuild = new StringBuilder(), block = new StringBuilder("---------------------\n");
        strBuild.append("Машина ").append(this.detail.getBrand()).append(" не завелась\n");
        strBuild.append(block).append("Log:\nМарка ").append(this.detail.getBrand()).append("\tЦена = ")
                .append(this.detail.getPrice()).append("\tСкорость = ").append(this.detail.getSpeed()).append("\n").append(block);

        // System.out.println("Машина " + this.detail.getBrand() + " не завелась!");
        // System.out.println("Log:\n Марка" + this.detail.getBrand() + "\tЦена = " +
        //        this.detail.getPrice() + "\tСкорость = " + this.detail.getSpeed());

        return strBuild;
    }
}
