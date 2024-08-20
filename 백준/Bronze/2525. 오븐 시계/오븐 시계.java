import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] hhmm = br.readLine().split(" ");
        int h  =  Integer.parseInt(hhmm[0]);
        int m  =  Integer.parseInt(hhmm[1]);

        int running = Integer.parseInt(br.readLine());

        h += running / 60;
        m += running % 60;
        
        if( m >= 60 ){
            m -= 60;
            h += 1;
        }

        if(h >=24){
            h -= 24;
        }

        System.out.print(h + " " + m);
        br.close();
    }
}