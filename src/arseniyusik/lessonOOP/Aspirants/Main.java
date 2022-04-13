package arseniyusik.lessonOOP.Aspirants;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Антон","Антонов",202,5);
        students[1] = new Aspirant("Иван","Иванов",102,5,"Научная работа - Лес");

        for (Student j : students) {
            System.out.println(j.getFirstName() + " " + j.getLastName() +" гр. "+ j.getGroup() +
                    " стипендия - " + j.getScholarship());
        }
    }
}
