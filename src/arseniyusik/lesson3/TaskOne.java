package arseniyusik.lesson3;

public class TaskOne {
    public static void main(String[] args) {
        String ValueType;
        int number = 1233;
        if (number >= 0) {
            ValueType = "Это число " + number + " положительное";
        } else {
            ValueType = "Это число " + number + " отрицательное";
        }
        int count = 0;
        for (int i = number; i != 0; ) {
            i /= 10;
            count++;
        }
        switch (count) {
            case 1: {
                ValueType += " и оно однозначное.";
                break;
            }
            case 2: {
                ValueType += " и оно двухзначное.";
                break;
            }
            case 3: {
                ValueType += " и оно трехзначное.";
                break;
            }

            default:
                ValueType += " и оно многозначное.";
        }
        System.out.println(ValueType);
    }
}
