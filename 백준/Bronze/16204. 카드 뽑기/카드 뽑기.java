import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int K = Integer.parseInt(inputs[2]);
        int[] front = {M , N-M};
        int[] back = {K , N - K};
        System.out.println(Math.min(front[0],back[0]) + Math.min(front[1],back[1]));

        br.close();
    }
}