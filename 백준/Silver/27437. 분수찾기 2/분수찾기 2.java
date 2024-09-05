import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long  input = Long.parseLong(br.readLine());
        long n, endSeq = 0 ;
        for ( n = 1; ; n++) {
            endSeq += n;
            if (endSeq >=  input) break;
        }
        long a = n - (endSeq - input) ;
        long b = 1 +  (endSeq - input) ;
        if(n %2 == 0){
            System.out.println(a + "/" + b);
        }else{
            System.out.println(b + "/" + a);
        }
        br.close();
    }
}