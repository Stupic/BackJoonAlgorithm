//규칙:       *       *               *                               *            
//입력:   1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16
//결과:   1	2	2	4	2	4	6	8	2	4	6	8	10	12	14	16
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