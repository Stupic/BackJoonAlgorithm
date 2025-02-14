import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0 ; i < n ; i++){
            int level = Integer.parseInt(br.readLine());
            if(level % 2 != 0) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
