import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {1, 0 , -1, 0};
        int[] dy = {0, 1, 0, -1};

        int caseCnt = Integer.parseInt(br.readLine());
        while (caseCnt-- > 0) {

            String[] line = br.readLine().split(" ");
            int lengthX = Integer.parseInt(line[0]);
            int lengthY = Integer.parseInt(line[1]);
            int napaCabbageCnt = Integer.parseInt(line[2]);

            int[][] matrix = new int[lengthX][lengthY];
            int[][] dist = new int[lengthX][lengthY];
            Queue<int[]> locations = new LinkedList<>();
            while (napaCabbageCnt-- > 0) {
                String[] position = br.readLine().split(" ");
                int x = Integer.parseInt(position[0]);
                int y = Integer.parseInt(position[1]);
                matrix[x][y] = 1;
                locations.add(new int[]{x, y});
            }
            int requestWorm = 0;

            for(int[] location : locations) {
                int x = location[0];
                int y = location[1];
                if(matrix[x][y] == 1 && dist[x][y] == 0){
                    requestWorm++;
                    Queue<int[]> que = new LinkedList<>();
                    que.add(new int[]{x, y});
                    while (!que.isEmpty()) {
                        int[] pxy = que.poll();
                        int px = pxy[0];
                        int py = pxy[1];
                        for (int i = 0; i < 4; i++) {
                            int newX = px + dx[i];
                            int newY = py + dy[i];
                            if (newX < 0 || newX >= lengthX || newY < 0 || newY >= lengthY || dist[newX][newY] != 0 || matrix[newX][newY] == 0) {
                                continue;
                            }
                            que.add(new int[]{newX, newY});
                            dist[newX][newY] =  1;
                        }
                    }
                }
            }

            System.out.println(requestWorm);
        }
        br.close();
    }
}
