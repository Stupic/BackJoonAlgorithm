import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        BigInteger a = new BigInteger(line[0],2);
        BigInteger b = new BigInteger(line[1],2);

        BigInteger sum = a.add(b);
        System.out.println(sum.toString(2));
    }
}