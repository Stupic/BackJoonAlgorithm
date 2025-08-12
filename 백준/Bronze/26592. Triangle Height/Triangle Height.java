import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (count-- > 0) {
            String[] inputs = br.readLine().split(" ");
            double a = Double.parseDouble(inputs[0]);
            double b = Double.parseDouble(inputs[1]);
            double h = (double) Math.round((a * 2) / b * 100) / 100;
            sb.append("The height of the triangle is ").append(String.format("%.2f", h)).append(" units\n");
        }
        System.out.println(sb);
        br.close();
    }
}