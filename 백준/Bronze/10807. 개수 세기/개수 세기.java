import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int size = Integer.parseInt(br.readLine());
        String[] numbers = br.readLine().split(" ");

        int searchNumber = Integer.parseInt(br.readLine());
        for (int i = 0; i < numbers.length ; i++) {
            if(i >= size) break;
            
            int number = Integer.parseInt(numbers[i]);
            
            if(number == searchNumber) result++;
        }

        System.out.println(result);
        br.close();
    }

}