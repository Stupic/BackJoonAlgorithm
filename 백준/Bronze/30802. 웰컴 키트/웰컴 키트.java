import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] peopleBySize = br.readLine().split(" ");
        String[] TP = br.readLine().split(" ");
        int T = Integer.parseInt(TP[0]);
        int P = Integer.parseInt(TP[1]);

        int packageCnt = 0;
        for (int i = 0; i < peopleBySize.length; i++) {
            int people = Integer.parseInt(peopleBySize[i]);
            packageCnt += (int)Math.ceil((double) people/T);
        }
        System.out.println(packageCnt);
        System.out.println(N/P + " " + N%P);
        br.close();
    }
}