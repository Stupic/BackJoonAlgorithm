import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        BigInteger a = new BigInteger(br.readLine().substring(0,n));
        BigInteger b = new BigInteger(br.readLine().substring(0,m));
        System.out.println(a.multiply(b));
        br.close();
    }
}
