import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        double m = (double) (b - a) / 400;

        double result = 1 / ( 1 + Math.pow(10, m));

        System.out.println(result);

        br.close();
    }
}