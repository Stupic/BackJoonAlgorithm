import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int i = 9;
        while (i-- > 0){
            total -= Integer.parseInt(br.readLine());
        }
        System.out.println(total);

        br.close();
    }
}