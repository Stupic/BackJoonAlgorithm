import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger bigInteger = BigInteger.ONE;
        List<BigInteger> list = new LinkedList<>();
        for (int i = 1 ; i <= n ; i ++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            if(i % 100 == 0 || i == n){
                list.add(bigInteger);
                bigInteger = BigInteger.ONE;
            }
        }
        BigInteger result = BigInteger.ONE;
        for (BigInteger item : list){
           result = result.multiply(item);
        }
        System.out.println(result);
        br.close();
    }
}