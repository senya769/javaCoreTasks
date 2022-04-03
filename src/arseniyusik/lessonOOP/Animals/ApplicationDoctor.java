package arseniyusik.lessonOOP.Animals;

public class ApplicationDoctor {
    public static void main(String[] args) {
        Animal []animals = new Animal[3];
        animals[0] = new Cat("Корм","Дом",true,10);
        animals[1] = new Dog("Кость","Будка",false,100);
        animals[2] = new Horse("Трава","Поле",false,4);
        Vet doctor = new Vet("Mr.Dock");
        System.out.println(doctor.getName() + " выполняет прием животных в кол-ве " + animals.length);
        for (Animal j : animals) {
            System.out.println(++Animal.count + ":");
            doctor.treatAnimal(j);
        }
    }
}
