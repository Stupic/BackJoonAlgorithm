import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!Objects.equals(input = br.readLine(), "*")) {
            String[] strs = input.split(" ");

            boolean flag = true;
            char first = 0;
            for (String str : strs) {
                if (first == 0 ){
                    first = Character.toUpperCase(str.charAt(0));
                }else if (first != Character.toUpperCase(str.charAt(0))) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println('Y');
            }else{
                System.out.println('N');
            }
        }
    }

}