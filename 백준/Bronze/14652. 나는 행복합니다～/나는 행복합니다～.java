import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int m = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(inputs[2]);

        System.out.println(k / m + " " + (k % m));

        br.close();
    }
}
