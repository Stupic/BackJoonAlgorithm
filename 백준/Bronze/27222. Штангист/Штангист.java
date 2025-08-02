import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] schedules = br.readLine().split(" ");
        int increase = 0;
        for (int i = 0; i < n; i++) {
            String schedule = schedules[i];
            String[] result = br.readLine().split(" ");
            if (schedule.equals("0")) continue;

            int before = Integer.parseInt(result[0]);
            int after = Integer.parseInt(result[1]);

            if(before > after) continue;

            increase  += after - before;
        }

        System.out.println(increase);

        br.close();
    }
}