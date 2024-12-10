import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for (int y = start; y <= end; y +=  3 * 4 * 5) {
            System.out.println("All positions change in year 1" + y);
        }

        br.close();
    }
}

