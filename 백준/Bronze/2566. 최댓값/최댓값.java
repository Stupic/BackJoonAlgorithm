import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxNumer = -1;
        String site = "";
        for (int i = 0; i < 9 ; i++) {
            String[] numbers = br.readLine().split(" ");
            for (int j = 0; j < numbers.length; j++) {
                int number = Integer.parseInt(numbers[j]);
                if (number > maxNumer) {
                    maxNumer = number;
                    site = (i+1) + " " + (j+1);
                }
            }
        }

        System.out.println(maxNumer);
        System.out.println(site);
        br.close();
    }
}