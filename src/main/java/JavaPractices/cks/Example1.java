package JavaPractices.cks;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        String str[] = {"12.12.12.12", "13.13.13.112",
                "VUUT.12.12",
                "111.111.11.111",
                "1.1.1.1.1.1.1\n",
                ".....",
                "1...1..1..1",
                "0.0.0.0",
                "255.0.255.0",
                "266.266.266.266",
                "00000.000000.0000000.00001",
                "0023.0012.0012.0034"};
        Arrays.stream(str).forEach(f -> {
            System.out.println(f.matches(new MyRegex().pattern));
        });
           /* String IP = "00000.000000.0000000.00001";
            System.out.println(IP.matches(new MyRegex().pattern));*/
    }
}
    /**
     * \d         matches a single character that is a digit
     * you must escape the characters ^.[$()|*+?{\with a backslash \ as they have special meaning.
     */
        class MyRegex {
            String strRex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
            String finalRegx = strRex + "\\." + strRex + "\\." + strRex + "\\." + strRex;
            String pattern = Pattern.compile(finalRegx).toString();
        }



