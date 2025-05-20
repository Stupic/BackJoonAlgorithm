import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for (int i =1 ;  i<= cnt ; i ++){
            String input = br.readLine();
            System.out.println(i + ". " + input);
        }

        br.close();
    }
}