package arseniyusik.lesson11.task2_palindromes;

public class TextEditor {

    public static int wordsLength(String line) {
        StringBuilder buffer = new StringBuilder();
        String[] words = line.split("\\s");// разбиение по словам
        return words.length;
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 1) return false;
        StringBuilder builder = new StringBuilder();
        builder.append(word);
        return word.equals(builder.reverse().toString());
    }
}
