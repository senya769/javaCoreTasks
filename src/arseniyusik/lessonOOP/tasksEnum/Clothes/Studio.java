package arseniyusik.lessonOOP.tasksEnum.Clothes;

public class Studio {
    public void putOnMan(Clothes[] clothes){
        for (Clothes j: clothes) {
            j.putOnMan();
            System.out.println("-------------");
        }
    }
    public void putOnWoman(Clothes[] clothes){
        for (Clothes j: clothes) {
            j.putOnWoman();
            System.out.println("-------------");
        }
    }
}
