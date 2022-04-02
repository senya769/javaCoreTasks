package arseniyusik.lessonOOP.Tools;

public class Trumpet implements Tool {
    private double diametr;

    public Trumpet(){}
    public Trumpet(double diametr) {
        this.diametr = diametr;
    }

    public void play(){
        System.out.println("Играет Труба, с диаметром " + this.diametr +" с тональностью "+ Tool.KEY);
    }
}
