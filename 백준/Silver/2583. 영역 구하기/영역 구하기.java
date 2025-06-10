import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    static int[][] matrix;
    static int m ;
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        // m = 행, n = 열
        m = Integer.parseInt(inputs[0]);
        n = Integer.parseInt(inputs[1]);
        int areaCnt = Integer.parseInt(inputs[2]);

        matrix = new int[m][n];
        while (areaCnt-- > 0){
            // x = 열 좌표, y= 행좌표
            String[] coordinates = br.readLine().split(" ");
            int x1 = Integer.parseInt(coordinates[0]);
            int y1 = Integer.parseInt(coordinates[1]);
            int x2 = Integer.parseInt(coordinates[2]);
            int y2 = Integer.parseInt(coordinates[3]);

            for (int x = x1 ; x <  x2 ; x++ ){
                for (int y = y1 ;  y < y2 ; y ++){
                    matrix[y][x] = 1;
                }
            }
        }

        LinkedList<Integer> areaSize = new LinkedList<>();
        for (int i = 0; i < m; i++){
            for (int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0)  areaSize.push(measureArea(j,i));
            }
        }

        areaSize.sort((a,b)-> a - b);
        StringBuilder sb = new StringBuilder();
        sb.append(areaSize.size()).append("\n");
        for (Integer size : areaSize){
            sb.append(size).append(' ');
        }
        System.out.println(sb);
        br.close();
    }

    static Integer measureArea(int startX, int startY){
        matrix[startY][startX] = 1;
        int size = 1;
        int[] dx = {1, 0 , -1, 0};
        int[] dy = {0, 1, 0, -1};

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX,startY});

        while (!stack.isEmpty()){
            int[] xy = stack.pop();
            int x = xy[0];
            int y = xy[1];

            for (int i = 0; i < 4; i ++){
                if(x + dx[i] < 0 || x + dx[i] >= n) continue;
                if(y + dy[i] < 0 || y + dy[i] >= m) continue;
                if(matrix[y+dy[i]][x+dx[i]] != 0) continue;

                matrix[y+dy[i]][x+dx[i]] = 1;
                size++;
                stack.push(new int[]{x+dx[i],y+dy[i]});
            }
        }

        return size;
    }
}