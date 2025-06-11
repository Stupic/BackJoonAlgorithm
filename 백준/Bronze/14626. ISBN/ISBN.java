import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int sum = 0 , x = 0, acc = 1;
        for (int i = 0; i < input.length() ; i++){
            int mul =  i % 2 == 0 ? 1 : 3;
            if(input.charAt(i) == '*'){
                acc = i % 2 == 0 ? 1 : 3;
                continue;
            }
            sum += (input.charAt(i) - '0') *  mul ;
        }
        for (int i = 0 ; i < 10  ;  i ++){
            if( (sum + i * acc) % 10 == 0){
                 x = i;
                 break;
            }
        }
        System.out.println(x);

        br.close();
    }
}
