import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                String[] inputs = br.readLine().split(" ");

                int a = Integer.parseInt(inputs[0]);
                int b = Integer.parseInt(inputs[1]);
                sb.append(a + b).append(" ").append(a * b).append("\n");
            }
        }
        System.out.println(sb);

        br.close();
    }

}