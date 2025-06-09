import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int pivot = (input.length() / 2 )+ ( input.length() % 2 != 0 && input.charAt(input.length() - 1) != '0' ? 1 : 0);
        int a = Integer.parseInt(input.substring(0, pivot));
        int b = Integer.parseInt(input.substring(pivot));
        System.out.println(a + b);

        br.close();
    }
}