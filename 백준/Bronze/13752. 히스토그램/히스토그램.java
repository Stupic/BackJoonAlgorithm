import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int repeat  = Integer.parseInt(br.readLine());
            sb.append( "=".repeat(repeat)).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}
