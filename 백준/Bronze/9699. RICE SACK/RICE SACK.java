import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int cnt = 1; cnt <= caseCnt; cnt++) {
            String[] inputs = br.readLine().split(" ");
            int weight = 0;
            for (int i = 0; i < inputs.length; i++) {
                weight = Math.max(weight, Integer.parseInt(inputs[i]));
            }
            sb.append("Case #").append(cnt).append(": ").append(weight).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}