import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        while (n-- > 0){
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int d = Integer.parseInt(inputs[1]);
            int g = Integer.parseInt(inputs[2]);
            int mul = a == (d + g) ? 2 : 1;
            int score =  mul * a * (d + g);
            max = Math.max(max, score);
        }
        System.out.println(max);

        br.close();
    }
    
}