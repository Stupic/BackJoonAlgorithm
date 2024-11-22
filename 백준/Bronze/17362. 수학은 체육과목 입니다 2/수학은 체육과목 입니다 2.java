import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.valueOf(br.readLine());

        if (n <= 5L) {
            System.out.println(n);
        } else {
            long divide = (n - 5) / 4;
            long remainder = (n - 5) % 4;
            if (divide % 2 == 0) {
                System.out.println(5 - remainder);
            } else {
                System.out.println(remainder + 1);
            }
        }

        br.close();
    }
}
