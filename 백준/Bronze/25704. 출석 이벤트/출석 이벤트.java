import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ticketCnt = Integer.parseInt(br.readLine());
        int amount = Integer.parseInt(br.readLine());
        int discount = 0;

        if (ticketCnt >= 5) discount = 500;
        if (ticketCnt >= 10) discount = Math.max(discount, amount / 10);
        if (ticketCnt >= 15) discount = Math.max(discount, 2000);
        if (ticketCnt >= 20) discount = Math.max(discount, amount / 4);

        System.out.println(Math.max(0, amount - discount));

        br.close();
    }

}