import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = br.readLine()).equals("0")) {
            int n = Integer.parseInt(input);

            for (int i = 1; i <= n; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("*".repeat(i));
                System.out.println(sb);
            }
        }
        br.close();
    }

}