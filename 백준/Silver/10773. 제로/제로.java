import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(n);
            }
        }

        int sum = 0;
        for (int n: stack) {
            sum += n;
        }
        System.out.println(sum);
        br.close();
    }
}