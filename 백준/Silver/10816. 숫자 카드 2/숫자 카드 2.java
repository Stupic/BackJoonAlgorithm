import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] store =new int[20000001]; //-10000000 <= M 10000000

        int nSize =Integer.parseInt(br.readLine());
        String[] nNumbers = br.readLine().split(" ");
        for (int i = 0; i < nSize; i++) {
            int number = Integer.parseInt(nNumbers[i]);
            store[number+10000000]++;
        }

        StringBuffer sb = new StringBuffer();
        int mSize =Integer.parseInt(br.readLine());
        String[] mNumbers = br.readLine().split(" ");
        for (int i = 0; i < mSize; i++) {
            int number = Integer.parseInt(mNumbers[i]);
            sb.append(store[number+10000000]).append(" ");
        }

        System.out.println(sb);
        br.close();
    }
}