import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String input = br.readLine();
            sb.append(input.charAt(0));
            for (int i = 1; i < input.length(); i++) {
                if (sb.toString().charAt(sb.length() - 1) != input.charAt(i)) {
                    sb.append(input.charAt(i));
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
        br.close();
    }
}