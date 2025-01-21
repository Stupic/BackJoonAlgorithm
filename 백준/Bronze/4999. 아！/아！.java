import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String required = br.readLine();
        String response = br.readLine();
        System.out.println(required.contains(response) ? "go" : "no");
        br.close();
    }
}