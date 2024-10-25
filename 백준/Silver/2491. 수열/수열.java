import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int max = 1;
        int increase = 1;
        int decrease = 1;
        for (int i = 1; i < size; i++) {
            if (arr[i] >= arr[i-1]) {
                increase++;
            }else{
                increase = 1;
            }
            if (arr[i] <= arr[i-1]) {
                decrease++;
            }else {
                decrease = 1;
            }
            int curMax =Math.max(increase, decrease);
            max = Math.max(max, curMax);
        }

        System.out.println(max);
        br.close();
    }
}