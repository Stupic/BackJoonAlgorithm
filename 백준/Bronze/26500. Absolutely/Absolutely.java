import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        for(int i = 0 ; i< count ; i++){
            String[] input = br.readLine().split(" ");
            double distance = Math.abs(Double.parseDouble(input[0]) - Double.parseDouble(input[1]));
            System.out.printf("%.1f\n", distance);
        }
        br.close();
    }
}