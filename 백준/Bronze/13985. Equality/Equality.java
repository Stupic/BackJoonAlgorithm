import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int a = Integer.parseInt(line.charAt(0) + "");
        int b = Integer.parseInt(line.charAt(4) + "");
        int c = Integer.parseInt(line.charAt(8) + "");

        System.out.printf(a + b == c ? "YES" : "NO");

        br.close();
    }
}
