import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] HIARC = br.readLine().split(" ");
        long H = Long.parseLong(HIARC[0]);
        long I = Long.parseLong(HIARC[1]);
        long A = Long.parseLong(HIARC[2]);
        long R = Long.parseLong(HIARC[3]);
        long C = Long.parseLong(HIARC[4]);
        System.out.println(H * I - A * R * C);
        br.close();
    }
}