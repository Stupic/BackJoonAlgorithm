import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            String a = input[0];
            String b = input[1];

            StringBuilder sb = new StringBuilder();
            sb.append("Distances:");
            for (int j = 0; j < a.length(); j++) {
                char aChar = a.charAt(j);
                char bChar = b.charAt(j);
                int distance = bChar - aChar;
                sb.append(" ").append( distance < 0 ? distance  + 26 : distance );
            }
            System.out.println(sb);

        }

        br.close();
    }
}