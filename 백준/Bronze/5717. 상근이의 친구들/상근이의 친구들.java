import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] tokens = input.split(" ");
            int m = Integer.parseInt(tokens[0]);
            int w = Integer.parseInt(tokens[1]);
            System.out.println(m + w);
        }
        br.close();
    }

}
