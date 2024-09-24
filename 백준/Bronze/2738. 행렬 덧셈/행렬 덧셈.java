import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int column = Integer.parseInt(input[1]);

        int[][] matrixN = new int[row][column];
        int[][] matrixM = new int[row][column];

        for (int i = 0; i < row; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                matrixN[i][j] = Integer.parseInt(input[j]);
            }
        }

        for (int i = 0; i < row; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                matrixM[i][j] = Integer.parseInt(input[j]);
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < matrixN.length; i++) {
            for (int j = 0; j < matrixN[i].length; j++) {
                sb.append(matrixN[i][j] + matrixM[i][j]).append(" ");
            }
            if ( i  != matrixN.length - 1) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
        br.close();
    }
}