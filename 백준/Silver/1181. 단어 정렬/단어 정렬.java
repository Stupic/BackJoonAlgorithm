import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        String[] list = new String[size];
        for (int i = 0; i < size; i++) {
            list[i] = br.readLine();
        }

        list = Arrays.stream(list).distinct().toArray(String[]::new);
        Arrays.sort(list,(a,b)-> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length()-b.length();
        } );
        StringBuffer sb = new StringBuffer();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}