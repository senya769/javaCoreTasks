package arseniyusik.lessonRegular.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AplMain {
    public static void main(String[] args) {
        String reg = "255.255.255.16";
        String pat = "^((\\d|[1-9]\\d|1\\d\\d|2[0-5]\\d|25[0-5])\\.){3}\\d|[1-9]\\d|1\\d\\d|2[0-5]\\d|25[0-5]$";
        //[A-Z0-9._%+-]+@[A-Z0-9-]+\\.[a-z]{2,}
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(reg);
        System.out.println(matcher.find());
        while(matcher.find()){
        System.out.println(matcher.group());
        }
    }
}
