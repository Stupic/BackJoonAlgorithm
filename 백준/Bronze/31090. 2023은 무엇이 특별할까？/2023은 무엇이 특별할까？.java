import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int year = Integer.parseInt(br.readLine());
            int yy = year % 100;
            sb.append((year + 1) % yy == 0 ? "Good" : "Bye").append("\n");
        }
        System.out.println(sb);
        
        br.close();
    }
}