import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Boolean> map = new HashMap<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(map.containsKey(s)) map.remove(s);
            else map.put(s, true);
        }
        System.out.println(map.keySet().toArray()[0]);
        br.close();
    }
}