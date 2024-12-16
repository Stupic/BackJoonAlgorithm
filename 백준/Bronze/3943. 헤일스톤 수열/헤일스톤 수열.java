import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {

            int n = Integer.parseInt(br.readLine());
            int big = n;
            while (n != 1){
                if (n % 2 == 0){
                    n = n / 2;
                }else{
                    n = n * 3 + 1;
                }
                big = Math.max(big, n);
            }
            System.out.println(big);
        }

        br.close();
    }
}