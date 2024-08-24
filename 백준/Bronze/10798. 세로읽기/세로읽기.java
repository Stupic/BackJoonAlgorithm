import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = 5;
        int column = 0;

        String[] stringArr = new String[row];

        for (int i = 0; i < row; i++) {
            String string = br.readLine();
            stringArr[i] = string;
            if ( column < string.length()){
                column = string.length();
            }
        }

        for (int c = 0; c < column; c++) {
            for (int r = 0; r < row; r++) {
                String string = stringArr[r];
                if(string.length() < c+1){
                    continue;
                }
                System.out.print(string.charAt(c));
            }
        }
        br.close();
    }

}