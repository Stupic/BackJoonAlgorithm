import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String,Integer> map = new HashMap<>();
        map.put("miss", 0);
        map.put("bad", 200);
        map.put("cool", 400);
        map.put("great", 600);
        map.put("perfect", 1000);

        String[] input = br.readLine().split(" ");
        int lev = Integer.parseInt(input[0]);
        String score = input[1];

        System.out.println(lev * map.get(score));

        br.close();
    }
}