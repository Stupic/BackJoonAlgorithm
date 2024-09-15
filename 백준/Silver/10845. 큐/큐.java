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

    public void push(int x) {
        Item item = new Item(x);
        Item target = front;

        if (target == null) {
            front = item;
        } else {
            while (target.getNext() != null) {
                target = target.getNext();
            }
            target.setNext(item);
        }
    }

    public void pop() {
        if (front == null) System.out.println(-1);
        else {
            System.out.println(front.getValue());
            front = front.getNext();
        }
    }

    public void front() {
        if (front == null) System.out.println(-1);
        else System.out.println(front.getValue());
    }

    public void back() {
        if (front == null) System.out.println(-1);
        else {
            Item target = front;
            while (target.getNext() != null) {
                target = target.getNext();
            }
            System.out.println(target.getValue());
        }
    }

    public void getSize() {
        int size = 0;
        Item item = front;
        while (item != null) {
            item = item.getNext();
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
    private int value;
    private Item next = null;

    public Item(int value) {
        this.value = value;
    }

    public Item getNext() {
        return this.next;
    }

    public void setNext(Item item) {
        this.next = item;
    }

    public int getValue() {
        return this.value;
    }
}