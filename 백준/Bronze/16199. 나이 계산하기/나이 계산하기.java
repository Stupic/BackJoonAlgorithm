import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] birthYMD = br.readLine().split(" ");
        String[] curYMD = br.readLine().split(" ");
        int diffY = Integer.parseInt(curYMD[0]) - Integer.parseInt(birthYMD[0]);
        String birthMD = String.format("%02d", Integer.parseInt(birthYMD[1])) + "-" + String.format("%02d", Integer.parseInt(birthYMD[2]));
        String curMD = String.format("%02d", Integer.parseInt(curYMD[1])) + "-" + String.format("%02d", Integer.parseInt(curYMD[2]));
        int isPassBirth = curMD.compareTo(birthMD);

        //만 나이
        System.out.println(diffY == 0 ? 0 : diffY - 1 + (isPassBirth < 0 ? 0 : 1) );
        //세 나이
        System.out.println(diffY + 1);
        //연 나이
        System.out.println(diffY);

        br.close();
    }
}