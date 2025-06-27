import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(str.length() > 2 &str.charAt(0) == '"' && str.charAt(str.length() -1) == '"'
                ? str.substring(1, str.length() - 1)
                : "CE");

        br.close();
    }
}

