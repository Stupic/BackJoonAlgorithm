import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(br.readLine());

        int price = Integer.parseInt(br.readLine());
        for (int i = 1; i < days; i++) {
            int change = Integer.parseInt(br.readLine());
            price += change;
        }

        System.out.println(price);
    }
}