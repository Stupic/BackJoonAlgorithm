import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int t = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        System.out.println(s == 1 || !(t >= 12 && t <= 16) ? 280 : 320);

        br.close();
    }
}