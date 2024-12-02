import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String input;
       while (!(input = br.readLine()).equals("#")) {
           char target =  input.charAt(0);

           String string = input.substring(2);

           int cnt = 0;
           for (int i = 0; i < string.length(); i++) {
                if (Character.toLowerCase(string.charAt(i)) == target) {
                    cnt++;
                }
           }
           System.out.println(target + " " + cnt);
       }

        br.close();
    }
}