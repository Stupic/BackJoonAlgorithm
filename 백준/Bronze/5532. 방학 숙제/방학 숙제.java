import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l  =  Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int ac = a / c  + (a % c == 0 ? 0 : 1);
        int bd = b / d + (b % d == 0 ? 0 : 1);
        System.out.println( l - Math.max(ac, bd));

        br.close();
    }

}