import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        int result = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Character,Integer> applies = new HashMap<>();

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < inputs.length ; i ++){
            char c = inputs[i].toUpperCase().charAt(0);
            if(!applies.containsKey(c)) applies.put(c,1);
            else applies.put(c, applies.get(c) + 1);
        }

        inputs = br.readLine().split(" ");
        for (int i = 0; i < inputs.length ; i ++){
            char c = inputs[i].toUpperCase().charAt(0);
            result += applies.containsKey(c) ? applies.get(c) : 0 ;
        }

        System.out.println(result);

        br.close();
    }
}
