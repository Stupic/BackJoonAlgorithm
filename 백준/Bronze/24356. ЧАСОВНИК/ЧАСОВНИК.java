import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        int t1  = Integer.parseInt(inputs[0]);
        int m1  = Integer.parseInt(inputs[1]);
        int t2  = Integer.parseInt(inputs[2]);
        int m2  = Integer.parseInt(inputs[3]);

        int time =  (t2 * 60 + m2) - (t1 * 60 + m1);
        time = time < 0 ? time + 1440 : time;

        System.out.println(time + " " + time / 30);

        br.close();
    }

}