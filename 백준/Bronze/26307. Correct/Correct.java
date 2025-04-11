import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int h = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        System.out.println( (h - 9) * 60 + m );

        br.close();
    }
}