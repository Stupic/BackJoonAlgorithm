import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i< count ; i++){
            String input = br.readLine();
            System.out.println(input.charAt(input.length()-1) == '.' ? input : input+".");
        }
        br.close();
    }
}