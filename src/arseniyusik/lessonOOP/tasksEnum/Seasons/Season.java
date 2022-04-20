package arseniyusik.lessonOOP.tasksEnum.Seasons;

public enum Season {
    WINTER(-5.2),
    SPRING(9.2),
    SUMMER(17.2){
        @Override
        public void getDescription() {
            System.out.println("Теплая пора года");
        }
    },
    AUTUMN(8.9);
    private final double averageTemperature;

    Season(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void getFavoriteSeason() {
        switch (this) {
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case SPRING:
                System.out.println("Я люблю весню!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            default:
                System.out.println("Я не люблю никакую пору года!");
        }
    }

    public void getDescription() {
        System.out.println("Холодная пора года");
    }
}
