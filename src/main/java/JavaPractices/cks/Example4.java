package JavaPractices.cks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4 {
    public static void main(String[] args) {
        String regex = "<(.+)>([^<]+)</\\1>";
        String line = "<h1>Nayeem loves counseling</h1>";
        boolean matchFound = false;
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(line);
        while (m.find()) {
            System.out.println(m.group(2));
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("None");
        }
    }
}
