import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        LinkedList<String> list = new LinkedList<>();
        list.add(String.valueOf(n));
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                list.add(String.valueOf(n));
            }else{
                n = n * 3 + 1;
                list.add(String.valueOf(n));
            }
        }
        System.out.println(String.join(" ",list));
        br.close();
    }
}
