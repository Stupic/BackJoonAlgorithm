import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sb.append(" ").append(i);
            if (i % 6 == 0 || i == n) sb.append(" Go!");
        }
        System.out.println(sb);

        br.close();
    }
}