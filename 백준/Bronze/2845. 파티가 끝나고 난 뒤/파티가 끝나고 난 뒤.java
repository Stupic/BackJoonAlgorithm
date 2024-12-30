import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int capacity = Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[1]);

        StringBuilder sb = new StringBuilder();
        inputs = br.readLine().split(" ");
        for (String input : inputs) {
            sb.append(Integer.parseInt(input) - capacity).append(" ");
        }
        System.out.println(sb);

        br.close();
    }

}