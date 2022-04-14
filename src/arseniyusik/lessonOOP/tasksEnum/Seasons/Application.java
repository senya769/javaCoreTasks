package arseniyusik.lessonOOP.tasksEnum.Seasons;

public class Application {

    public static void main(String[] args) {
        Season likeSeason = Season.SUMMER;
        likeSeason.getFavoriteSeason();
        System.out.println();
        for (Season j: Season.values()) {
            System.out.println(j + " temp:(" +j.getAverageTemperature()+") ");
            j.getDescription();
            System.out.println("----------------------------");
        }
    }
    }


