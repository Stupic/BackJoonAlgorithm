import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        System.out.println(getRepunit(x) + getRepunit(y));

        br.close();
    }

    static int getRepunit  (int n){
        return switch (n) {
            case 1 -> 1;
            case 2 -> 11;
            case 3 -> 111;
            case 4 -> 1111;
            case 5 -> 11111;
            case 6 -> 111111;
            case 7 -> 1111111;
            case 8 -> 11111111;
            case 9 -> 111111111;
            default -> 0;
        };
    }
}