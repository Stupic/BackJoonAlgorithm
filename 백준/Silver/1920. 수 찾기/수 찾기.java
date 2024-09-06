import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String , Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String[] nInput = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String value = nInput[i];
            map.put(value, 1);
        }

        int m = Integer.parseInt(br.readLine());
        String[] mInput = br.readLine().split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < m; i++) {
            String value = mInput[i];
            if (map.containsKey(value)) {
                sb.append(1).append("\n");
            }else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}