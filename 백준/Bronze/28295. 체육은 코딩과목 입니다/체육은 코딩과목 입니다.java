import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] azimuth = {"E", "S", "W", "N"};
        int cur = 3;
        for (int i = 0; i < 10; i++) {
            int command = Integer.parseInt(br.readLine());
            cur += command;
        }
        System.out.println(azimuth[cur % azimuth.length]);

        br.close();
    }
}