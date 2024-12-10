import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        for (int y = start; y <= end; y++) {
            int years = y - start;
            if (years % 4 == 0  && years % 3 == 0 && years % 5 == 0){
                System.out.println("All positions change in year " + y);
            }
        }

        br.close();
    }
}

