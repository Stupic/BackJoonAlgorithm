import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        long init = Long.parseLong(input[0]);
        long result = Long.parseLong(input[1]);
        int count = -1;

        int processCnt = 1;
        while (result > init) {
            String number = String.valueOf(result);
            if(number.charAt(number.length()-1) == '1') {
                result = Long.parseLong(number.substring(0, number.length()-1));
            }else if(result % 2 == 0 ){
                result = result / 2;
            }else{
                break;
            }
            processCnt++;
            if(result == init){
                count = processCnt;
                break;
            }
        }
        System.out.println(count);
        br.close();
    }
}