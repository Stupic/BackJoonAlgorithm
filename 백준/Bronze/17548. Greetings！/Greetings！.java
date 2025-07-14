import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() ; i++) {
            sb.append(input.charAt(i));
            if(input.charAt(i) == 'e') sb.append(input.charAt(i));
        }
        System.out.println(sb);
        
        br.close();
    }
}