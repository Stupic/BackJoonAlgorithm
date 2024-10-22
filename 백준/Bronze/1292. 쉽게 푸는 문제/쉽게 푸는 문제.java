import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int start = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        int sum = 0;

        int number = 1;
        int count = 0;
        for (int i = 1; i <= end; i++) {
            if(i >= start) {
                sum += number;
            }
            count++;
            if( count == number){
                count = 0;
                number++;
            }
        }

        System.out.println(sum);
        br.close();
    }
}