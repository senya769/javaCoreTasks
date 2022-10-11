package arseniyusik.examples.test2;

import java.util.HashMap;
import java.util.Map;

//Реализовать класс “Журнал успеваемости”. В конструктор передать список фамилий студентов. Реализовать методы:
//выставления оценки студенту. принимает на вход фамилию студента, номер занятия и оценку
//получения оценки студента за некоторое занятие. принимает на вход фамилию студента и номер занятия. возвращает оценку
//получения среднего балла студента. принимает на вход фамилию, возвращает средний балл
//получение списка фамилий студентов, средний балл которых выше или равен заданному
//добавления нового студента
public class Student extends Thread {
    private final String  fam;
    private Map<Integer, Integer> mapGrades = new HashMap<>();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + fam + '\'' +
                ", mapGrades=" + mapGrades +
                '}';
    }

    public Student(String fam) {
        this.fam = fam;
    }

    @Override
    public void run() {

    }

    public double getAverageMark() {
        double mark = 0;
        for (int i : mapGrades.values()) {
            mark += i;
        }
        return mark / mapGrades.values().size();
    }

    public String getFam() {
        return fam;
    }

    public Student addGrade(int numberLesson,int grade) {
        mapGrades.put(numberLesson,grade);
        return this;
    }


    public Map<Integer, Integer> getMapGrades() {
        return mapGrades;
    }

    public void setMapGrades(Map<Integer, Integer> mapGrades) {
        this.mapGrades = mapGrades;
    }
}
