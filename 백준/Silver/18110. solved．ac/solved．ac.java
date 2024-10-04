
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        list.sort((o1, o2) -> o1 - o2);

        int sum = 0;
        int cutIndex = (int) Math.round(n * 0.3 /2);
        for (int i = cutIndex; i < n - cutIndex; i++) {
            sum += list.get(i);
        }
        
        System.out.println((int)Math.round((float) sum / (n - cutIndex * 2)));
        br.close();
    }
}