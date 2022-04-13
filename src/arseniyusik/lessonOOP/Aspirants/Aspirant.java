package arseniyusik.lessonOOP.Aspirants;

public class Aspirant extends Student{
    private String scienceWork;

    public Aspirant(){}
    public Aspirant(String scienceJob) {
        this.scienceWork = scienceJob;
    }

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scienceJob) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceJob;
    }
    public int getScholarship(){
        if(this.getAverageMark() >= 5){
            return 200;
        }
        else {
            return 180;
        }
    }
}
