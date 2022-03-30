package arseniyusik.lessonOOP.Tools;

public class Drum implements Tool {
    private int size;

    public Drum(){}
    public Drum(int size) {
        this.size = size;
    }

    public void play(){
        System.out.println("Играет Барабан, размером " + this.size +" с тональностью "+ Tool.KEY);
    }
}
