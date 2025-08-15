import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int sum = 0;
        while ((n = Integer.parseInt(br.readLine())) != -1) {
            sum += n;
        }
        System.out.println(sum);

        br.close();
    }

}