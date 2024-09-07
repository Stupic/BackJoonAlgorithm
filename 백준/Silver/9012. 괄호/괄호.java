import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            CustomStack stack = new CustomStack(str.length());
            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty() && str.charAt(j) == ')') {
                    stack.push(str.charAt(j));
                    break;
                } else if (str.charAt(j) == ')' && stack.peek() == '(') {
                    stack.pop();
                }else{
                    stack.push(str.charAt(j));
                }

            }
            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }

        br.close();
    }
}


class CustomStack {
    int pos = 0;
    char[] store;

    public CustomStack(int size) {
        store = new char[size];
    }

    public void push(char str) {
        store[pos++] = str;
    }
    public char pop() {
        return store[--pos];
    }
    public char peek() {
        return store[pos-1];
    }
    public boolean isEmpty() {
        return pos == 0;
    }
}