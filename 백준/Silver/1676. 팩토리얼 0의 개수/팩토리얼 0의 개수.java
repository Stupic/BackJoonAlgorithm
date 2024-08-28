import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        BigInteger integer = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            integer = integer.multiply(BigInteger.valueOf(i));
        }

        String str = integer.toString();

        int count = 0;
        for (int i = str.length() -1; i >= 0; i--) {
            if (str.charAt(i) == '0') {
                count++;
            }else if(count != 0){
                break;
            }
        }
        System.out.println(count);
        br.close();
    }
}