import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int v = n / 5;
        int i = n % 5;
        
        while (v-- > 0) System.out.print("V");
        while (i-- > 0) System.out.print("I");
        
        br.close();
    }
}