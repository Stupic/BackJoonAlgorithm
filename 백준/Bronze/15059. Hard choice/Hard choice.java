import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] supplies = br.readLine().split(" ");
        String[] demands = br.readLine().split(" ");
        int lack = 0;
        for (int i = 0; i< supplies.length ; i++){
            int supply = Integer.parseInt(supplies[i]);
            int demand = Integer.parseInt(demands[i]);
            lack += supply < demand ? demand - supply : 0;
        }
        System.out.println(lack);
        
        br.close();
    }
}
