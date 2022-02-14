package JavaPractices.cks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Example6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger bigInteger = new BigInteger(n);
        if(bigInteger.isProbablePrime(2))
            System.out.println("prime");
        else
            System.out.println("not prime");

    }


}
