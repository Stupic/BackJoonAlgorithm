import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        System.out.println( Integer.parseInt(inputs[1]) * 2 - Integer.parseInt(inputs[0]));
        br.close();
    }
}