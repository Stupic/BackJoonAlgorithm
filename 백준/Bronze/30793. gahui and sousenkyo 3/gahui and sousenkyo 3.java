import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        double p = Integer.parseInt(input[0]);
        double r = Integer.parseInt(input[1]);
        if ( p/r < 0.20){
            System.out.println("weak");
        } else if ( p/r < 0.40) {
            System.out.println("normal");
        } else if ( p/r < 0.60) {
            System.out.println("strong");
        }else{
            System.out.println("very strong");
        }
        br.close();
    }
}