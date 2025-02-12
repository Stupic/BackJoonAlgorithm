import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());

        System.out.println(total.add(diff).divide(BigInteger.TWO));
        System.out.println(total.subtract(total.add(diff).divide(BigInteger.TWO)));

        br.close();
    }
}

