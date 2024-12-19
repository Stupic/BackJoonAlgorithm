import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        float a = Integer.parseInt(inputs[0]);
        float b = Integer.parseInt(inputs[1]);
        float c = a * b / 100;

        System.out.println( a - c >= 100 ? 0 : 1);
        br.close();
    }
}