import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String criminal = null;
        for(int i = 0; i < cnt; i++) {
            String s = br.readLine();
            if(s.contains("S")){
                criminal = s;
            }
        }

        System.out.println(criminal);
        br.close();
    }
}