package arseniyusik.lessonStreams.task3_distinct;

import java.util.*;
import java.util.stream.Collectors;

public class AppMain {

    public static void main(String[] args) {
        //Получение коллекции без дубликатов из неупорядоченного стрима - [a1, a2, a3] — порядок не гарантируется.
        //Получение коллекции без дубликатов из упорядоченного стрима - [a1, a2, a3] — порядок гарантируется.
        List <String> ordered = Arrays.asList("a1", "a4", "a2", "a3", "a1", "a2", "a2");
        Collection nonOrdered = new HashSet<>(ordered);
        var ord = ordered.stream().distinct().toList();
        System.out.println(ord);
        var nonOrd = nonOrdered.stream().distinct().toList();
        System.out.println(nonOrd);
    }
}
