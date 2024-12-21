import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        String a = br.readLine().replace(" ", "");
        String b = br.readLine().replace(" ", "");

        System.out.println(min(a,b,length));

        br.close();
    }

    static String min(String a, String b ,int length) {
        String result = a;
        if (a.length() == b.length()) {
            for (int i = 0; i < length; i++) {
                if (a.charAt(i) > b.charAt(i)) {
                    result = b;
                    break;
                }else if(a.charAt(i) < b.charAt(i)) {
                    result = a;
                    break;
                }
            }
        }else{
            result = a.length() > b.length() ? b : a;
        }

        return result;
    }
}