import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] gandalf = {1, 2, 3, 3, 4, 10};
        int[] sauron = {1, 2, 2, 2, 3, 5, 10};

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < cnt; i++) {
            long gandalfScore = 0;
            long sauronScore = 0;

            String[] gandalfTeam = br.readLine().split(" ");
            String[] sauronTeam = br.readLine().split(" ");
            for (int j = 0; j < gandalfTeam.length; j++) {
                gandalfScore += gandalf[j] * Long.parseLong(gandalfTeam[j]);
            }
            for (int j = 0; j < sauronTeam.length; j++) {
                sauronScore += sauron[j] * Long.parseLong(sauronTeam[j]);
            }

            String header = "Battle " + (i + 1) + ": ";
            if (gandalfScore > sauronScore) {
                System.out.println(header + "Good triumphs over Evil");
            } else if (gandalfScore < sauronScore) {
                System.out.println(header + "Evil eradicates all trace of Good");
            } else {
                System.out.println(header + "No victor on this battle field");
            }
        }

        br.close();
    }
}