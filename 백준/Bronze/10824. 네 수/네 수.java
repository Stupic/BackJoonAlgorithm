import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];
        String c = input[2];
        String d = input[3];

        System.out.println(Long.parseLong(a + b) + Long.parseLong(c + d));
        br.close();
    }
}