import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int y = 2024;
        int m = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(y + (n * 7) / 12).append(" ").append(m + (n * 7) % 12);
        System.out.println(sb);
        br.close();
    }
}
