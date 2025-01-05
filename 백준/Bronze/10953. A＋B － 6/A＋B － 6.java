import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = s.charAt(0) - '0';
            int b = s.charAt(2) - '0';

            sb.append(a + b).append('\n');
        }

        System.out.println(sb);
        br.close();
    }
}