import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer sb = new StringBuffer();

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> requireSeq = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            requireSeq.add(Integer.parseInt(br.readLine()));
        }

        Stack<Integer> stack = new Stack<>();
        int seq = 0;
        for (int i = 1; i <= size; i++) {
            stack.push(i);
            sb.append("+").append("\n");
            while (!stack.isEmpty()) {
                if (stack.peek().equals(requireSeq.get(seq))) {
                    stack.pop();
                    seq++;
                    sb.append("-").append("\n");
                }else{
                    break;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println(sb);
        }else{
            System.out.println("NO");
        }
        br.close();
    }
}
