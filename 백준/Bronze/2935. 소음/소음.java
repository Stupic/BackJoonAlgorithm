import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());
        String operator= br.readLine();
        BigInteger b = new BigInteger(br.readLine());

        if(operator.equals("*")){
            System.out.println(a.multiply(b));
        }else{
            System.out.println(a.add(b));
        }
        br.close();
    }
}