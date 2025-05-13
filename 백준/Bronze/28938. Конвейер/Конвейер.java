import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =  Integer.parseInt(br.readLine());
        int pos = 0;
        String[] numbers = br.readLine().split(" ");
        for (int i = 0 ; i <  n ; i++){
            pos += Integer.parseInt(numbers[i]);
        }
        System.out.println(pos == 0 ? "Stay" : pos > 0 ? "Right" : "Left");
        
        br.close();
    }
}