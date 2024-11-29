import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int n1 = (int) (n * 0.78);
        int n2 = (int) (n * 0.8 + (n - n * 0.8) * 0.78);
        System.out.println(n1 + " " + n2);
    }
}