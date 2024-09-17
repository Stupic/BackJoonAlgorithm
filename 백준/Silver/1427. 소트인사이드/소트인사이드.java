import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, String> map = new HashMap<>();

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), "");
            }
            map.put(input.charAt(i), map.get(input.charAt(i)) + input.charAt(i));
        }

        StringBuffer sb = new StringBuffer();
        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.reverse(keys);
        for (Character key : keys) {
            sb.append(map.get(key));
        }
        System.out.println(sb);
        br.close();
    }

}