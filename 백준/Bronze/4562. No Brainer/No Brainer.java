import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for (int i = 1; i <= cnt; i++) {
            String[] inputs = br.readLine().split(" ");
            System.out.println(Integer.parseInt(inputs[0]) < Integer.parseInt(inputs[1])
                    ? "NO BRAINS"
                    : "MMM BRAINS");
        }

        br.close();
    }
}