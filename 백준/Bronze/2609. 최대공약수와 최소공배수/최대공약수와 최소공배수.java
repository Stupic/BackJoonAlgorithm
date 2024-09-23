import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        //최대공약수 구하기 (유클리드 호제법)
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        while (big % small != 0) {
            int temp  = small;
            small = big % small;
            big = temp;
        }
        int gcd = small;

        //최소공배수 구하기  (두수의 곱 나누기 최대공약수)
        int lcm =  n * m  / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        br.close();
    }
}