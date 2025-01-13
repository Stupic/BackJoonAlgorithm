import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int max = 0;
        for(int i = 0 ; i< count ; i++){
            String line = br.readLine();
            int lineMax = 0;
            while (line.length() >= 3){
               if(line.substring(0,3).equals("for")){
                   line = line.substring(3);
                   lineMax++;
               }else if(line.length() >=5 && line.substring(0,5).equals("while")){
                   line = line.substring(5);
                   lineMax++;
               }else{
                   line = line.substring(1);
               }
            }
            max = Math.max(max, lineMax);
        }

        System.out.println(max);
        br.close();
    }
}