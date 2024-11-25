import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!Objects.equals(input = br.readLine(), "0 0 0")) {
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);
            int c = Integer.parseInt(input.split(" ")[2]);

            if (a == 0) {
                a = c / b;
            } else if (b == 0) {
                b = c / a;
            } else if (c == 0) {
                c = a * b;
            }
            System.out.println(a + " " + b + " " + c);
        }

        br.close();
    }
}