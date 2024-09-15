import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cmdCnt = Integer.parseInt(br.readLine());
        MyQueue queue = new MyQueue();
        for (int i = 0; i < cmdCnt; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    queue.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "front":
                    queue.front();
                    break;
                case "back":
                    queue.back();
                    break;
                case "size":
                    queue.getSize();
                    break;
                case "empty":
                    queue.isEmpty();
                    break;
            }
        }
        br.close();
    }
}

class MyQueue {
    Item front = null;
    Item last = null;

    public void push(int x) {
        Item item = new Item();
        item.value = x;

        Item target = front;
        if (target == null) {
            front = item;
            last = item;
        } else {
            while (target.next != null) {
                target = target.next;
            }
            target.next = item;
            last = target.next;
        }
    }

    public void pop() {
        if (front == null) System.out.println(-1);
        else {
            System.out.println(front.value);
            front = front.next;
            if (front == null) last = null;
        }
    }

    public void front() {
        if (front == null) System.out.println(-1);
        else System.out.println(front.value);
    }

    public void back() {
        if (last == null) System.out.println(-1);
        else System.out.println(last.value);
    }

    public void getSize() {
        int size = 0;
        Item item = front;
        while (item != null) {
            item = item.next;
            size++;
        }
        System.out.println(size);
    }

    public void isEmpty() {
        if (front == null) System.out.println(1);
        else System.out.println(0);
    }

}

class Item {
    public int value;
    public Item next = null;
}