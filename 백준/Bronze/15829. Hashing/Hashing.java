import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        BigInteger hash = BigInteger.valueOf(0);
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            BigInteger val = BigInteger.valueOf((int) c - 96);
            hash = hash.add(val.multiply(BigInteger.valueOf(31).pow(i)));
        }
        System.out.println(hash.remainder(BigInteger.valueOf(1234567891)));
        br.close();
    }
}