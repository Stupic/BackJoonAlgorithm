import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int minIndex = 0;
        int sum = 0;
        for (int i = 0 ; i < input.length ; i++){
            sum += Integer.parseInt(input[i]);
            if(Integer.parseInt(input[minIndex]) >= Integer.parseInt(input[i])) minIndex = i;
        }

        if (sum < 100 ){
            switch (minIndex){
                case 0:
                    System.out.println("Soongsil");
                    break;
                case 1:
                    System.out.println("Korea");
                    break;
                case 2:
                    System.out.println("Hanyang");
                    break;
            }
        }else{
            System.out.println("OK");
        }
        br.close();
    }
}