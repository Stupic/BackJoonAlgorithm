import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        System.out.println(
                input.indexOf('M') != -1 &&
                input.indexOf('O') != -1 &&
                input.indexOf('B') != -1 &&
                input.indexOf('I') != -1 &&
                input.indexOf('S') != -1 ? "YES" : "NO"
        );

        br.close();
    }
}