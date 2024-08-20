import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i< size/4 ; i++){
            result.append("long ");
        }
        System.out.println( result.append("int"));
        br.close();
    }
}