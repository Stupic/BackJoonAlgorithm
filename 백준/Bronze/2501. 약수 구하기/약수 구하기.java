import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] input = br.readLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) {
                list.add(i);
            }
        }
        int number = list.size() >= q ? list.get(q - 1) : 0;
        System.out.println(number);
        br.close();
    }
}