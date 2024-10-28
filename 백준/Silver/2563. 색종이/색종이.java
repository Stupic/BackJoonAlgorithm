import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] bord = new int[100][100];
        int paperCnt = Integer.parseInt(br.readLine());

        while (paperCnt-- > 0) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            for (int i = x; i < x + 10 ; i++) {
                for (int j = y; j < y+ 10 ; j++) {
                    bord[i][j] = 1;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++) {
                if (bord[i][j] == 1) {
                    area += 1;
                }
            }
        }
        System.out.println(area);
        br.close();
    }
}