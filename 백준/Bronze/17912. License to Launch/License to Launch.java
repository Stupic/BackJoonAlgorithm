import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] days = br.readLine().split(" ");

        int minDay = 0;
        for (int i = 0; i < n; i++) {
            int trash = Integer.parseInt(days[i]);
            int minTrash = Integer.parseInt(days[minDay]);
            if (trash == 0) {
                minDay = i;
                break;
            }
            if (trash < minTrash) minDay = i;
        }
        System.out.println(minDay);

        br.close();
    }
}