import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!Objects.equals(input = br.readLine(), "***")) {
            System.out.println(new StringBuffer(input).reverse());
        }
        
        br.close();
    }
}