import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        float score = 0;
        switch (input.charAt(0)) {
            case 'A':
                score = 4;
                break;
            case 'B':
                score = 3;
                break;
            case 'C':
                score = 2;
                break;
            case 'D':
                score = 1;
                break;
        }

        if (score == 0)
            System.out.printf("%.1f",score);
        else {
            switch (input.charAt(1)) {
                case '+':
                    score += 0.3F;
                    break;
                case '-':
                    score -= 0.3F;
                    break;
            }

            System.out.printf("%.1f",score);
        }

        br.close();
    }
}