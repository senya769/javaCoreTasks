package arseniyusik.lessonOOP.Tools;

public class ApplicationInterface {
    public static void main(String[] args) {
        Tool [] tools = new Tool[3];
        tools[0] = new Drum(10);
        tools[1] = new Gitare(6);
        tools[2] = new Trumpet(3.2);
        for (Tool j : tools) {
            j.play();
        }
    }
}
