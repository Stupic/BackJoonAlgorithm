import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (cnt-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            String s = input[1];
            for (int i = 0; i < n; i++) {
                sb.append(s);
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}