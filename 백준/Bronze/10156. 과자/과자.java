import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int price = Integer.parseInt(line[0]);
        int count = Integer.parseInt(line[1]);
        int money = Integer.parseInt(line[2]);

        int over =  price * count - money;
        System.out.println(Math.max(over, 0));
        br.close();
    }
}