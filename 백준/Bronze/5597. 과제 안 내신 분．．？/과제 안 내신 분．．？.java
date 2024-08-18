import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] attendanceNumbers = new int[30];

        for (int i = 0; i < 28; i++) {
            int attendanceNumber = Integer.parseInt(br.readLine());
            attendanceNumbers[attendanceNumber - 1] = 1;
        }

        for (int i = 0; i < attendanceNumbers.length; i++) {
            if (attendanceNumbers[i] == 0) {
                System.out.println(i + 1);
            }
        }

        br.close();
    }

}