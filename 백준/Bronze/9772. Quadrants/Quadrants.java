import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            String[] xy = input.split(" ");
            float x = Float.parseFloat(xy[0]);
            float y = Float.parseFloat(xy[1]);

            if (x == 0 || y == 0) {
                System.out.println("AXIS");
            } else if (y > 0 ) {
                System.out.println( x < 0 ? "Q2" : "Q1");
            } else {
                System.out.println( x < 0 ?  "Q3" : "Q4");
            }

            if (input.equals("0 0")) break;
            
        }
        br.close();
    }
}