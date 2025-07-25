import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a = n / 2 ;
        int b = n % 2;
        System.out.println( a + (b == 1 ? 3 : 0));

        br.close();
    }
}