import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char c = br.readLine().charAt(0);

        switch (c) {
            case 'N':
            case 'n':
                System.out.println("Naver D2");
                break;
            default:
                System.out.println("Naver Whale");
                break;
        }
    }

}