import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long calculate = 0L;
        long amount = Long.parseLong(br.readLine());
        int count = Integer.parseInt(br.readLine());

        for( int i = 0; i < count ; i++){
            String[] item = br.readLine().split(" ");
            calculate += (long) Integer.parseInt(item[0]) * Integer.parseInt(item[1]);
        }

        String result =  (amount == calculate) ? "Yes" : "No";
        System.out.println(result);
        br.close();
    }
}