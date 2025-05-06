import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] aeiou = {'a', 'e', 'i', 'o', 'u'};
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Arrays.binarySearch(aeiou, c) >= 0) {
                result += 1;
            }
        }
        System.out.println(result);
        br.close();
    }

}