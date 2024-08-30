
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder s = new StringBuilder();

        for (int i = 1; i < n; i++) {
            s.append(" ".repeat(Math.max(0, n - i)));
            s.append("*".repeat(Math.max(0, 2 * (i - 1) + 1)));
            s.append('\n');
        }

        for (int i = n; i > 0; i--) {
            s.append(" ".repeat(Math.max(0, n - i)));
            s.append("*".repeat(Math.max(0, 2 * (i - 1) + 1)));

            if ( i != 1){
                s.append('\n');
            }
        }

        System.out.println(s);
        br.close();
    }
}