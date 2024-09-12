import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String input = br.readLine();
            if(input.equals("0")) break;

            int length = input.length();
            boolean flag = true;
            for (int i = 0; i < (float)(length-1)/2; i++) {
                if (input.charAt(i) != input.charAt(length-1-i)) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "yes" : "no");
        }

        br.close();
    }

}