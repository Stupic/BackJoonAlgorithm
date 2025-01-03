import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger sum = BigInteger.ZERO;
        for(int i = 0 ; i < 5 ; i++){
           sum = sum.add(new BigInteger(br.readLine()));
        }
        System.out.println(sum);
        br.close();
    }
}