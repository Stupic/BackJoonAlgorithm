import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        String[] gList = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < k; i++) {
            int grade = Integer.parseInt(gList[i]);
            int cal = grade * 100 / n;

            if (cal <= 4) sb.append(1).append(" ");
            else if (cal <= 11) sb.append(2).append(" ");
            else if (cal <= 23) sb.append(3).append(" ");
            else if (cal <= 40) sb.append(4).append(" ");
            else if (cal <= 60) sb.append(5).append(" ");
            else if (cal <= 77) sb.append(6).append(" ");
            else if (cal <= 89) sb.append(7).append(" ");
            else if (cal <= 96) sb.append(8).append(" ");
            else if (cal <= 100) sb.append(9).append(" ");
        }

        System.out.println(sb.substring(0, sb.length()-1));
        br.close();
    }
}