import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        int lengthX = Integer.parseInt(size[0]);
        int lengthY = Integer.parseInt(size[1]);

        char[][] matrix = new char[lengthX][lengthY];
        int[][] dist = new int[lengthX][lengthY];
        int[] dx = {1, 0 , -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < lengthX; i++) {
            String line = br.readLine();
            for (int j = 0; j < lengthY; j++) {
                matrix[i][j] = line.charAt(j);
                dist[i][j] = -1;
            }
        }

        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0, 0});
        dist[0][0] = 1;

        while (!que.isEmpty()) {
            int[] xy = que.poll();
            int x = xy[0];
            int y = xy[1];

            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];

                if (newX < 0 || newX >= lengthX || newY < 0 || newY >= lengthY || dist[newX][newY] != -1 || matrix[newX][newY] == '0') {
                    continue;
                }
                que.add(new int[]{newX, newY});
                dist[newX][newY] = dist[x][y] + 1;
            }
        }

        System.out.println(dist[lengthX-1][lengthY-1]);
        br.close();
    }
}