import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        char[] code = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Stack<Integer> list = new Stack<>();

        int number = Integer.parseInt(input[0]);
        int formation = Integer.parseInt(input[1]);
        while (number != 0) {
            list.push(number % formation);
            number /= formation;
        }
        StringBuffer sb = new StringBuffer();
        while (!list.isEmpty()) {
            sb.append(code[list.pop()]);
        }
        System.out.println(sb.isEmpty() ? 0 : sb );
        br.close();
    }
}