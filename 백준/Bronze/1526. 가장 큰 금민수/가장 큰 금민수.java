import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < n.length(); i++) {
                char c = n.charAt(i);
                if (c == '4' || c == '7') {
                    flag = false;
                }else{
                    flag = true;
                    break;
                }
            }
            if (!flag) System.out.println(n);
            else n = (Integer.parseInt(n) -1) + "";
        }
        br.close();
    }
}