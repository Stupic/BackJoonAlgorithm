import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vowels = "aeiouAEIOU";
        String input;
        while ( !(input = br.readLine()).equals("#") ){
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (vowels.contains(String.valueOf(input.charAt(i)))){
                    count++;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}