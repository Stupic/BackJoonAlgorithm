import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int r = Integer.parseInt(br.readLine());
        int g = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(r * 3 + g * 4 + b * 5);
        
        br.close();
    }
}