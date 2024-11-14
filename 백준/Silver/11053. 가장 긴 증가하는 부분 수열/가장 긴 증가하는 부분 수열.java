import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] list = new int[size];
        int[] dist = new int[size];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(input[i]);
            dist[i] = 1;
        }
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (list[i] > list[j]) {
                    dist[i] = Math.max(dist[i], dist[j] + 1);
                }
            }
            max =Math.max(max, dist[i]);
        }

        System.out.println(max);
        br.close();
    }
}

