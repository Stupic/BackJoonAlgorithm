import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        if(size == 1){
            System.out.println(1);
        }else{
            int maxN = 2;
            while (maxN < size) {
                maxN *= 2;
            }
            int reverseIndex = maxN - size;
            System.out.println(maxN - reverseIndex * 2);
        }
        br.close();
    }
}