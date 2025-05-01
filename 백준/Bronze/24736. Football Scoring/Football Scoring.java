import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] teamA = br.readLine().split(" ");
        String[] teamB = br.readLine().split(" ");

        int[] scoreTable = {6, 3, 2, 1, 2};

        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < scoreTable.length; i++) {
            scoreA += scoreTable[i] * Integer.parseInt(teamA[i]);
            scoreB += scoreTable[i] * Integer.parseInt(teamB[i]);
        }
        System.out.println(scoreA + " " + scoreB);
        br.close();
    }
}
