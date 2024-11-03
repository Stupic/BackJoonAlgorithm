import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int lengthX = Integer.parseInt(br.readLine());
        int lengthY = 5;

        String[] lines = new String[lengthX];

        for (int i = 0; i < lengthX; i++) {
            String line = br.readLine();
            lines[i] = line;
            lengthY = line.length();
        }

        char[][] matrix = new char[lengthX][lengthY];
        int[][] dist = new int[lengthX][lengthY];
        int[] dx = {1, 0 , -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < lengthX; i++) {
            for (int j = 0; j < lengthY; j++) {
                matrix[i][j] = lines[i].charAt(j);
                dist[i][j] = -1;
            }
        }


        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < lengthX; i++) {
            Queue<int[]> que = new LinkedList<>();
            for (int j = 0; j < lengthY; j++) {

                if (dist[i][j] != -1 || matrix[i][j] == '0')  continue;

                que.add(new int[]{i, j});
                dist[i][j] = 1;
                int count = 0;
                while (!que.isEmpty()) {
                    int[] xy = que.poll();
                    int x = xy[0];
                    int y = xy[1];

                    count++;

                    for (int k = 0; k < 4; k++) {
                        int newX = x + dx[k];
                        int newY = y + dy[k];

                        if (newX < 0 || newX >= lengthX || newY < 0 || newY >= lengthY || dist[newX][newY] != -1 || matrix[newX][newY] == '0') {
                            continue;
                        }
                        que.add(new int[]{newX, newY});
                        dist[newX][newY] = 1;
                    }
                }
                list.add(count);
            }
        }

        list.sort((o1, o2) -> o1-o2);
        System.out.println(list.size());
        for (Integer integer : list) {
            System.out.println(integer);
        }
        br.close();
    }
}
