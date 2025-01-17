import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        String[] input = br.readLine().split(" ");

        long invalidity = 0;
        BigInteger sum = BigInteger.ZERO;
        for (String s : input) {
            int val = Integer.parseInt(s);
            if(val == 0) invalidity++;
            else sum = sum.add(BigInteger.valueOf(val));
        }

        if (n <= invalidity * 2) {
            System.out.println("INVALID");
        }else{
            System.out.println( sum.compareTo(BigInteger.ZERO) > 0 ? "APPROVED" : "REJECTED");
        }

    }
}