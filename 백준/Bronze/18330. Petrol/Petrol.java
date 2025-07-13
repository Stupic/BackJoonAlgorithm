import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int x = k + 60;
        if (n <= x) System.out.println(n * 1500);
        else System.out.println(x * 1500 + (n - x) * 3000);


        br.close();
    }

}