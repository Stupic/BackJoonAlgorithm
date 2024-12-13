import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        float w = Float.parseFloat(inputs[0]);
        float h = Float.parseFloat(inputs[1]);

        float width = w * h / 2;

        System.out.printf("%.1f%n",width);
        br.close();
    }
}