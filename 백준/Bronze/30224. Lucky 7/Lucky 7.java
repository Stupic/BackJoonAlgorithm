import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        boolean isContain7 =  n.contains("7");
        boolean isDivide7 = Integer.parseInt(n) % 7 == 0;

        if(isContain7 && isDivide7){
            System.out.println("3");
        }else if(isContain7){
            System.out.println("2");
        }else if(isDivide7){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        br.close();
    }
}