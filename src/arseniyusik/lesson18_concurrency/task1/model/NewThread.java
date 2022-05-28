package arseniyusik.lesson18_concurrency.task1.model;

public class NewThread extends Thread{
    @Override
    public void run() {
        char c = 'X';
        for(int i = 0; i < 100; ++i){
            System.out.println(c);
        }
    }
}
