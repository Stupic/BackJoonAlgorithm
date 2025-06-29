import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if(c == 'l') result.append("L");
            else result.append("i");
        }

        System.out.println(result);
        br.close();
    }


}