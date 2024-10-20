import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        BigInteger denominator = BigInteger.ONE;
        BigInteger numerator = BigInteger.ONE;

        for (int i = M ; i >= 1 ; i--) {
            denominator = denominator.multiply(BigInteger.valueOf(N- i + 1));
            numerator = numerator.multiply(BigInteger.valueOf(i));
        }
        System.out.println(denominator.divide(numerator));

        br.close();
    }
}