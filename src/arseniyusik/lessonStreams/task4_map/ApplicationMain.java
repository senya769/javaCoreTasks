package arseniyusik.lessonStreams.task4_map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class ApplicationMain {
    public static void main(String[] args) {
        List<String> collection1 = asList("a1", "a2", "a3", "a1");
        List<String> collection2 = asList("1,2,0", "4,5");
        List<String> collectionAddLine = collection1.stream().map(p -> p + "_1").toList();
        System.out.println(collectionAddLine);
        int[] numbersCol1 = collection1.stream().mapToInt(p -> Integer.parseInt(p.substring(1))).toArray();
        System.out.println(Arrays.toString(numbersCol1));
        var numbersCol2 = collection2.stream().flatMap(p -> Arrays.stream(p.split(","))).toArray();
        System.out.println(Arrays.toString(numbersCol2));
        String s = "Hello";
    }

    public static int countChar(char sim, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sim) {
                count++;
            }
        }
        return count;
    }
}
