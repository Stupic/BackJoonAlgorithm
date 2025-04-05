import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        while ((input = br.readLine()) != null) {
            String[] split = input.split(" ");
            int n = Integer.parseInt(split[0]);
            long s = Long.parseLong(split[1]);
            System.out.println(s / ( n + 1 ));  
        }
        br.close();
    }
}