import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dist = 0;

        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);

        int avg = (a +b +c) / 3;

        if(c > avg){
            dist += c - avg;
            b += c - avg;
        }

        if(b > avg){
            dist += b - avg;
        }

        System.out.println(dist);
        br.close();
    }
    
}