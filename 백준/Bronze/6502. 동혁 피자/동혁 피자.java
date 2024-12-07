import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;

        int i = 0;
        while (!(input = br.readLine()).equals("0")) {
            String[] inputs = input.split(" ");
            int r = Integer.parseInt(inputs[0]);
            int w = Integer.parseInt(inputs[1]);
            int l = Integer.parseInt(inputs[2]);

            if (Math.pow((double) w / 2, 2) + Math.pow((double) l / 2, 2) <= Math.pow(r, 2)) {
                System.out.println("Pizza " + ++i + " fits on the table.");
            } else {
                System.out.println("Pizza " + ++i + " does not fit on the table.");
            }
        }

        br.close();
    }
}