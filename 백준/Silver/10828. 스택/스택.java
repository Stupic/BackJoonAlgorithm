
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cmdCnt = Integer.parseInt(br.readLine());
        MyStack myStack = new MyStack(cmdCnt);

        for (int i = 0; i < cmdCnt; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    myStack.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    myStack.pop();
                    break;
                case "top":
                    myStack.top();
                    break;
                case "empty":
                    myStack.printEmpty();
                    break;
                case "size":
                    myStack.size();
                    break;
            }
        }
        br.close();
    }

    public static class MyStack {
        int[] store;
        int pos;

        public MyStack(int size) {
            this.store = new int[size];
            this.pos = 0;
        }

        public void push(int x) {
            if (pos == store.length) return;
            this.store[pos++] = x;
        }

        public void pop() {
            if (this.isEmpty()) System.out.println(-1);
            else System.out.println(this.store[--pos]);
        }

        public void top() {
            if (this.isEmpty()) System.out.println(-1);
            else System.out.println(this.store[pos-1]);
        }

        private boolean isEmpty() {
            return pos == 0;
        }

        public void printEmpty() {
            System.out.println(this.isEmpty() ? 1 : 0);
        }

        public void size() {
            System.out.println(this.pos);
        }

    }
}