package JavaPractices.cks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

      //  Scanner in = new Scanner(System.in);
       // int numSentences = Integer.parseInt(in.nextLine());

       // while (numSentences-- > 0) {
            String input = "Goodbye bye bye world world world\n" +
                    "Sam went went to to to his business\n" +
                    "Reya is is the the best player in eye eye game\n" +
                    "in inthe\n" +
                    "Hello hello Ab aB";

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        //}

        //in.close();
    }
}
