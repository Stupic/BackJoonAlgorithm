import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuffer sb = new StringBuffer();
        char storeChar = input.charAt(0);
        sb.append(storeChar);
        for (int i = 1; i < input.length(); i++) {
            if (storeChar == '-') {
                sb.append(input.charAt(i));
            }
            storeChar = input.charAt(i);
        }
        System.out.println(sb);

        br.close();
    }
}