import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int jump = 1;
        StringBuilder sb = new StringBuilder();
        while (!Objects.equals(input = br.readLine(), "Was it a cat I saw?")){
            jump++;
            for (int i = 0; i < input.length(); i += jump){
                sb.append(input.charAt(i));
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}