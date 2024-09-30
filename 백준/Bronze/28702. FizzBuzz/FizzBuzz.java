import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add(br.readLine());
        list.add(br.readLine());
        list.add(br.readLine());

        int i ;
        long number = 0 ;
        for ( i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.matches("\\d+")) {
                number = Long.parseLong(s) + 3 - i;
                break;
            }
        }
        String result;
        if (number % 15 == 0){
            result = "FizzBuzz";
        }else if (number % 5 == 0){
            result = "Buzz";
        }else if (number % 3 == 0){
            result = "Fizz";
        }else{
            result = String.valueOf(number);
        }
        System.out.println(result);

        br.close();
    }
}