
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String input;
        while (!(input = br.readLine()).equals("END")){
            StringBuffer buffer = new StringBuffer(input);
            sb.append(buffer.reverse()).append("\n");
        }
        System.out.println(sb);

        br.close();
    }
}