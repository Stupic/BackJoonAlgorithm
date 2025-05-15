import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] max = br.readLine().split(" ");
        String[] mel = br.readLine().split(" ");

        System.out.println(score(max) == score(mel) ? "Draw" : score(max) > score(mel) ? "Max" : "Mel");
        br.close();
    }

    static int score(String[] etf) {
        int e = Integer.parseInt(etf[0]);
        int t = Integer.parseInt(etf[1]);
        int f = Integer.parseInt(etf[2]);
        return e * 3 + t * 20 + f * 120;
    }

}