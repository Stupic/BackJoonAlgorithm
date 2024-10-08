import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mingukScores = br.readLine().split(" ");
        String[] manseScores = br.readLine().split(" ");

        int mingukTotalScore = 0;
        for (String mingukScore : mingukScores) {
            mingukTotalScore += Integer.parseInt(mingukScore);
        }

        int manseTotalScore = 0;
        for (String manseScore : manseScores) {
            manseTotalScore += Integer.parseInt(manseScore);
        }

        System.out.println(Math.max(mingukTotalScore, manseTotalScore));
        br.close();
    }
}