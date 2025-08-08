import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Character> map = new HashMap<>();
        map.put('a','4');
        map.put('e','3');
        map.put('i','1');
        map.put('o','0');
        map.put('s','5');

        String input = br.readLine();;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length() ; i ++){
            char c =  input.charAt(i);
            output.append(map.getOrDefault(c,c));
        }
        System.out.println(output);

        br.close();
    }
}