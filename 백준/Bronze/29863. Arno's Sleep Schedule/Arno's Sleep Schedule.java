import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sleep = Integer.parseInt(br.readLine());
        int alarm = Integer.parseInt(br.readLine());

        if (sleep > alarm) {
            System.out.println(alarm + (24 - sleep));
        } else {
            System.out.println(alarm - sleep);
        }

        br.close();
    }
}