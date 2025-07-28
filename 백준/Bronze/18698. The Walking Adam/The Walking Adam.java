import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());

        while (repeat--  > 0){
            String input = br.readLine();
            int cnt = 0;
            for (int i = 0 ; i< input.length() ; i ++){
                char action = input.charAt(i);
                if(action == 'D') break;
                cnt ++;
            }
            System.out.println(cnt);
        }
    }

}