import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =  Integer.parseInt(br.readLine());
        int count = 0;

        String[] numbers = br.readLine().split(" ");

        for (int i = 0 ; i <  n ; i++){
            if( Integer.parseInt(numbers[i]) % 2 == 0 ) count++;
        }
        System.out.println( n - count  < count ? "Happy" : "Sad");
        br.close();
    }
}