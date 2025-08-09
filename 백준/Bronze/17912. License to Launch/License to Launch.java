import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] days = br.readLine().split(" ");

        int minTrash = Integer.MAX_VALUE;
        int minDay = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int trashDay = Integer.parseInt(days[i]);

            if (trashDay == 0) {
                minDay = i;
                break;
            }

            if (trashDay < minTrash) {
                minTrash = trashDay;
                minDay = i;
            }
        }
        System.out.println(minDay);

        br.close();
    }
}