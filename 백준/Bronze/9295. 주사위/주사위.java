import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i <= cnt ; i ++){
            String[] inputs =  br.readLine().split(" ");
            sb.append("Case ").append(i).append(": ")
                    .append(Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]))
                    .append('\n');
        }
        System.out.println(sb);

        br.close();
    }

}