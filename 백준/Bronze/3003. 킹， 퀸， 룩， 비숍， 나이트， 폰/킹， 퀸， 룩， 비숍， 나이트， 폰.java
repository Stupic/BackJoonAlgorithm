import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] required = {1,1,2,2,2,8};
        String[] input = br.readLine().split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            output.append(required[i] - Integer.parseInt(input[i])).append(' ');
        }
        System.out.println(output);
        br.close();
    }
}