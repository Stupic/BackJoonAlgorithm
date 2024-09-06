import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = br.readLine();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            c = Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            sb.append(c);
        }
        System.out.println(sb);
        br.close();
    }
}