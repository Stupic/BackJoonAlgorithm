import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result;
        String input = br.readLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        int[] balls = new int[n];
        for (int i = 0; i < m; i++) {
            input = br.readLine();
            split = input.split(" ");
            int start = Integer.parseInt(split[0]);
            int end = Integer.parseInt(split[1]);
            int number = Integer.parseInt(split[2]);
            Arrays.fill(balls, start -1, end , number);

        }
        result = Arrays.stream(balls)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));

        System.out.println(result);
        br.close();
    }
}