import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int[] list = {a, b, c};
        list = Arrays.stream(list).sorted().toArray();
        if (a == b && a == c) {
            System.out.println(2);
        } else {
            if (list[2] * list[2] == list[0] * list[0] + list[1] * list[1]) System.out.println(1);
            else System.out.println(0);
        }
        br.close();
    }
}