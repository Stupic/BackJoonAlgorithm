import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static RGB[][] grid;
    static int[][] isVisited ;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        grid = new RGB[N][M];
        isVisited = new int[N][M];
        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                int idx = 3 * j;
                int r = Integer.parseInt(input[idx]);
                int g = Integer.parseInt(input[idx+1]);
                int b = Integer.parseInt(input[idx+2]);
                grid[i][j] = new RGB(r, g, b);
                isVisited[i][j] = -1;
            }
        }

        int boundaryValue = Integer.parseInt(br.readLine());
        int objectCnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (isVisited[i][j] == -1 && grid[i][j].isObject(boundaryValue)) {
                    objectCnt++;
                    exploreGrid( i, j,boundaryValue);
                }
            }
        }

        System.out.println(objectCnt);
        br.close();
    }

    public static void exploreGrid(int startX, int startY, int boundaryValue ){
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startX, startY});
        isVisited[startX][startY] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX < 0 || nextY < 0)
                    continue;

                if (nextX >= grid.length || nextY >= grid[0].length)
                    continue;

                if (isVisited[nextX][nextY] != -1)
                    continue;

                RGB nextRgb = grid[nextX][nextY];
                if (nextRgb.isObject(boundaryValue)) {
                    queue.offer(new int[]{nextX, nextY});
                    isVisited[nextX][nextY] = 1;
                }
            }
        }
    }
}

class RGB {
    int r, g, b;
    RGB(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public boolean isObject(int boundaryValue) {
        return r + g + b >= boundaryValue * 3;
    }
}