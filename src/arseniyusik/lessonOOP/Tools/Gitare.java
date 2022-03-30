package arseniyusik.lessonOOP.Tools;

public class Gitare implements Tool{
    private int countStr;

    Gitare(){}
    public Gitare(int countStr) {
        this.countStr = countStr;
    }

    public void play(){
        System.out.println("Играет Гитара, с кол-во струн " + this.countStr +" с тональностью "+ Tool.KEY);
    }
}
