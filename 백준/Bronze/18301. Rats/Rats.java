import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        float n1 = Float.parseFloat(input[0]) + 1;
        float n2 = Float.parseFloat(input[1]) + 1;
        float n12 = Float.parseFloat(input[2]) + 1;
        float result = n1*n2/n12-1;
        System.out.println((int)Math.floor(result));
    }

}