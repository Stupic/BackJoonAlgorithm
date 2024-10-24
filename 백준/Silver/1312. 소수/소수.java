import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int number = Integer.parseInt(input[0]);
        int divisor = Integer.parseInt(input[1]);
        int position = Integer.parseInt(input[2]);

        int quotient = 0;
        int remainder = 0;
        for (int i = 0; i <= position; i++) {
            quotient = number / divisor;
            remainder = number % divisor;
            number = remainder * 10;
        }

        System.out.println(quotient);

        br.close();
    }
}