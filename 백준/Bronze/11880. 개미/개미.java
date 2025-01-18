import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");

            long a = Long.parseLong(inputs[0]);
            long b = Long.parseLong(inputs[1]);
            long c = Long.parseLong(inputs[2]);
            double case1 = Math.pow(a + b,2) + Math.pow(c,2);
            double case2 = Math.pow(a + c,2) + Math.pow(b,2);
            double case3 = Math.pow(a,2) + Math.pow(b+ c,2);
            double min = Math.min(case1, case2);
            min = Math.min(min, case3);
            System.out.println((long) min);
        }

        br.close();
    }
}