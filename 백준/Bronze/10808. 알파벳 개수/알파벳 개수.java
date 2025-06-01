import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] ints = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i) - 'a']++;
        }

        String result = Arrays.stream(ints)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
        br.close();
    }

}