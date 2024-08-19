import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result;
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[] basket = new int[N];

        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }
        
        int temp ;
        for (int i = 0; i < M; i++) {
            inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0])-1;
            int b = Integer.parseInt(inputs[1])-1;

            temp = basket[b];
            basket[b] = basket[a];
            basket[a] = temp;
        }
        
        result = Arrays.stream(basket)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        
        System.out.println(result);
        br.close();
    }
}