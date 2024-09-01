import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");

        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);

        int top = 1;
        int down = 1;

        //top n!/(n-k)!
        for (int i = n; i > n - k; i--) {
            top *= i;
        }

        //down k!
        for (int i = k; i > 0; i--) {
            down *= i;
        }
        System.out.println(top / down);
    }
}