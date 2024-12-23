import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int joi = 0;
        int ioi = 0;
        for (int i = 0; i< input.length() - 2  ; i++){
            String str = input.substring(i, i+3);
            if (str.equals("JOI")) joi++;
            if(str.equals("IOI")) ioi++;
        }

        System.out.println(joi);
        System.out.println(ioi);

        br.close();
    }
}