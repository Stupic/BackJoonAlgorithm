import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] schedules = br.readLine().split(" ");
        int hours = (n - 1) * 8;
        for (int i = 0; i < n; i++) {
            int study = Integer.parseInt(schedules[i]);
            hours += study;
        }
        System.out.println(hours / 24 + " " + hours % 24);

        br.close();
    }
}