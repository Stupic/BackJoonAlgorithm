import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseCnt; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            roomCounting(k, n);
        }
        br.close();
    }


    public static void roomCounting(int k, int n) {
        int[][] matrix = new int[k + 1][n];

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    matrix[i][j] = j + 1;
                } else if (j == 0) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
                }
            }
        }
        System.out.println(matrix[k][n - 1]);
    }
}