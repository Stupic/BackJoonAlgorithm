import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int h = Integer.parseInt(inputs[0]);
        StringBuilder result = new StringBuilder();
        while (h-- > 0){
            StringBuffer buffer = new StringBuffer(br.readLine());
            result.append(buffer.reverse()).append("\n");
        }
        System.out.println(result);
        
        br.close();
    }
}
