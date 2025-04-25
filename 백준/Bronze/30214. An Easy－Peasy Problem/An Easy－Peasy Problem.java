import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int s1 = Integer.parseInt(input[0]);
        int s2 = Integer.parseInt(input[1]);

        System.out.println(s1 * 2 >= s2 ? "E" : "H");
        br.close();
    }
}