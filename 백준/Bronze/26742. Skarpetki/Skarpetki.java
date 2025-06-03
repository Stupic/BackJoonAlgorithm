import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i),0);
            }
            if (map.get(input.charAt(i)) == 1) {
                map.put(input.charAt(i),0);
                result++;
            }else{
                map.put(input.charAt(i),1);
            }
        }
        System.out.println(result);

        br.close();
    }
}