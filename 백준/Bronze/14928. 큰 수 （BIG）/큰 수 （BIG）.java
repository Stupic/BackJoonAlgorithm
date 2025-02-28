import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        // (A + B) % N = ((A % N) + (B % N)) % N
        int divider = 20000303;
        int remainder = 0;
        for (int i = 0; i < n.length(); i++) {
            remainder = (remainder * 10 + n.charAt(i) - '0') % divider;
        }
        System.out.println(remainder);
        br.close();
    }
}
