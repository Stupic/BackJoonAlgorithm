import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String UOS = "UOS";
        int n = Integer.parseInt(br.readLine());
        System.out.println(UOS.charAt((n - 1) % 3));
        br.close();
    }
}
