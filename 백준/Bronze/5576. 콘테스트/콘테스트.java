import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] collegeW = new int[10];
        int[] collegeK = new int[10];

        int scoreW = 0;
        int scoreK = 0;

        for (int i = 0; i < collegeW.length ; i++) {
            collegeW[i] = Integer.parseInt(br.readLine());
        }
        scoreW = calculate(collegeW, 3);
        for (int i = 0; i < collegeK.length ; i++) {
            collegeK[i] = Integer.parseInt(br.readLine());
        }
        scoreK = calculate(collegeK, 3);

        System.out.println(scoreW + " " + scoreK);
        br.close();
    }

    static int calculate (int[] college, int rank) {
        int score = 0;

        Arrays.sort(college);
        for (int i = 0; i < rank; i++) {
            score += college[college.length - 1 - i];
        }
        return score;
    }
}