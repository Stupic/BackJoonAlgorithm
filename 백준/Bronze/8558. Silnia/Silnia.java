import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        switch (n) {
            case 0:
                System.out.println(1);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(6);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println(0);
                break;
        }

        br.close();
    }
}