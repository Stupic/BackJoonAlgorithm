import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        int sec = 0;
        int thaw = A >= 0 ? 0 : B > 0 ? Math.abs(A) : Math.abs(B - A);
        sec += thaw * C;
        A += thaw;
        
        if(A == 0) sec += D;
        if(A != B) sec += (B - A) * E;
        
        System.out.println(sec);
        br.close();
    }
}
