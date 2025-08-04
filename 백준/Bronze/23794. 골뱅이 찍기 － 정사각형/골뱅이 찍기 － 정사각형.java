import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()) + 2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) sb.append('@');
                else if (j == 0 || j == n - 1) sb.append('@');
                else sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);

        br.close();
    }

}