import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        boolean check1 = (a == 8 || a == 9) && (d == 8 || d == 9);
        boolean check2 = b == c;

        System.out.println(check1 && check2 ? "ignore" : "answer");

        br.close();
    }

}