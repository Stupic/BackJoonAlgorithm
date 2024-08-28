
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        ArrayList<Integer> units = new ArrayList<>();
        units.add(25);
        units.add(10);
        units.add(5);
        units.add(1);
        for (int i = 0; i < count; i++) {
            int money = Integer.parseInt(br.readLine());
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < units.size(); j++) {
                int coinCnt = money / units.get(j);
                str.append(coinCnt).append(" ");
                money %= units.get(j);
            }
            System.out.println(str);
        }
        br.close();
    }

}