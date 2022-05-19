package arseniyusik.lessonStreams.task2_match;

import java.util.Arrays;
import java.util.List;

/*
1 Найти существуют ли хоть один "a1" элемент в коллекции - true
2 Найти существуют ли хоть один "a8" элемент в коллекции - false
3 Найти есть ли символ "1" у всех элементов коллекции	- false
4 Проверить что не существуют ни одного "a7" элемента в коллекции	- true
*/
public class ApplicationMain {
    public static void main(String[] args) {
       List<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        boolean haveOneA1 = collection.stream().anyMatch("a1":: equals);
        System.out.println(haveOneA1);
        boolean haveOneA8 = collection.stream().anyMatch("a8":: equals);
        System.out.println(haveOneA8);
        boolean have1 = collection.stream().allMatch(p-> p.contains("1"));
        System.out.println(have1);
        boolean haveA7 = collection.stream().noneMatch("a7"::equals);
        System.out.println(haveA7);
    }
}
