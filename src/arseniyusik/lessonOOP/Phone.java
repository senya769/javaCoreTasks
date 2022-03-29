package arseniyusik.lessonOOP;

public class Phone {
    private int number;
    private String model;
    private double weight;

    Phone(){

    }

    Phone(int number,String model){
        this.number = number;
        this.model = model;
    }
    Phone(int number,String model,double weight){
        this(number,model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name,int number){
        System.out.println("Звонит " + name + ", его номер телефона - " + number);
    }

    public void getNumber(){
        System.out.println("Номер телефона - " + this.number);
    }

}
