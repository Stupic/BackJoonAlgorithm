import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0){
            String[] inputs = br.readLine().split(" ");
            int c = Integer.parseInt(inputs[0]);
            int p = Integer.parseInt(inputs[1]);
            sb.append(c).append(" ").append(p).append("\n");
            sb.append(p * c - 2 * (c - 1)).append("\n");
        }
        System.out.println(sb);
        
        br.close();
    }
}