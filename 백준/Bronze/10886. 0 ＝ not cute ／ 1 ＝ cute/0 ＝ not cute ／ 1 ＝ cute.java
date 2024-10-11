import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int headcount = Integer.parseInt(br.readLine());
        int vote = 0;
        for (int i = 0; i < headcount; i++) {
            vote += Integer.parseInt(br.readLine());
        }

        if (vote > headcount/2) {
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }

        br.close();
    }
}
