import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] barket1 = br.readLine().split(" ");
        String[] barket2 = br.readLine().split(" ");

        int count = Math.min(Integer.parseInt(barket1[0]) + Integer.parseInt(barket2[1]), Integer.parseInt(barket1[1]) + Integer.parseInt(barket2[0]));
        System.out.println(count);
        br.close();
    }
}
