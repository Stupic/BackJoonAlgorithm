import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        int seq = 0, number = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                seq++;
                number = i;
            }
            if (seq == q) break;
        }
        System.out.println(seq == q ? number : 0);
        br.close();
    }
}