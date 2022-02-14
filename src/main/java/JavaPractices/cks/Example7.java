package JavaPractices.cks;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);

        BigInteger ain = sc.nextBigInteger();
        BigInteger bin = sc.nextBigInteger();

        System.out.println(ain.add(bin));
        System.out.println(ain.multiply(bin));
    }

}
