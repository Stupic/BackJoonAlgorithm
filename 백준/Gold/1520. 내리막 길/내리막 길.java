import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int lengthX;
    static int lengthY;
    static int[][] matrix;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        lengthX = Integer.parseInt(size[0]);
        lengthY = Integer.parseInt(size[1]);

        matrix = new int[lengthX][lengthY];
        dp= new int[lengthX][lengthY];
        for (int i = 0; i < lengthX; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < lengthY; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
                dp[i][j] = -1;
            }
        }

        int pathCnt = dps(0,0);
        System.out.println(pathCnt);
        br.close();
    }

    public static int dps ( int x, int y) {
        int[] dx = {1, 0 , -1, 0};
        int[] dy = {0, 1, 0, -1};

        if(x == lengthX - 1 && y == lengthY - 1) {
            return 1;
        }

        if (dp[x][y] == -1) {
            dp[x][y] = 0;
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if(newX < 0 || newX >= lengthX || newY < 0 || newY >= lengthY) { //matrix over
                    continue;
                }
                
                if (matrix[newX][newY] < matrix[x][y]) {
                    dp[x][y] += dps(newX, newY);
                }
            }
        }

        return dp[x][y];
    }
}