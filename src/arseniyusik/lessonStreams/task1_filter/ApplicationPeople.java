package arseniyusik.lessonStreams.task1_filter;

import java.util.List;

public class ApplicationPeople {
    public static void main(String[] args) {

        People[] peoples = new People[]{new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN)};
        List<People> peopleList = List.of(peoples);
        // 1. Выбрать мужчин-военнообязанных (от 18 до 27 лет) - [{name='Петя', age=23, sex=MAN}]
        List<People> peopleArms = peopleList.stream().filter(People::findArmyAge).toList();
        System.out.println(peopleArms);
        //
        double average = peopleList.stream().filter(p -> p.getSex() == Sex.MAN)
                .mapToInt(People::getAge).average().getAsDouble();
        System.out.println(average);
        //Найти кол-во потенциально работоспособных людей в выборке
        // (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60
        var countWorking = peopleList.stream().filter(p -> p.getAge() >= 18).
                filter(p -> p.getSex() == Sex.MAN ?
                        p.getAge() <= 60 : p.getAge() <= 55).count();
        System.out.println(countWorking);
    }
}
