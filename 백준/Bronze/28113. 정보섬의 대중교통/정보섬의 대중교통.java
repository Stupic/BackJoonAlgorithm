import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs= br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int a = Integer.parseInt(inputs[1]);
        int b = Integer.parseInt(inputs[2]);

        if(n > b){
            System.out.println("Bus");
        }else{
            if(a == b){
                System.out.println("Anything");
            }else if(a > b){
                System.out.println("Subway");
            }else{
                System.out.println("Bus");
            }
        }

        br.close();
    }
}