package JavaPractices.cks;

import java.util.Arrays;

/**
 * Count the char from given string
 */
public class CountCharFromString {

    public static void main (String[] arg) {
        String str =  "TESTRESULTST";

       String [] str1 = str.split("");
        int end = 119;
        for ( int start =65 ;start <= end; start ++){
            String charSte =String.valueOf((char)start);
            long count = Arrays.stream(str1).filter(a -> a.equals(charSte)).count();
            if (count != 0)
                    System.out.println( charSte+"-"+count );
        }

    }
}
