import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        String[] numbers = br.readLine().split(" ");

        for (int i = 0; i < numbers.length; i++) {
            result += (int) Math.pow(Integer.parseInt(numbers[i]),2);
        }
        System.out.println(result%10);
        br.close();
    }
}