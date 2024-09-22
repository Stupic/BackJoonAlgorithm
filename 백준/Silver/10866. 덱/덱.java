import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cmdCnt = Integer.parseInt(br.readLine());
        MyDeque deque = new MyDeque();
        for (int i = 0; i < cmdCnt; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push_front":
                    deque.push_front(Integer.parseInt(cmd[1]));
                    break;
                case "push_back":
                    deque.push_back(Integer.parseInt(cmd[1]));
                    break;
                case "pop_front":
                    deque.pop_front();
                    break;
                case "pop_back":
                    deque.pop_back();
                    break;
                case "front":
                    deque.front();
                    break;
                case "back":
                    deque.back();
                    break;
                case "size":
                    deque.getSize();
                    break;
                case "empty":
                    deque.isEmpty();
                    break;
            }
        }
        br.close();
    }
}

class MyDeque {
    Item front = null;
    Item last = null;
    int size = 0;

    public void push_front(int val) {
        size++;
        Item item = new Item();
        item.value = val;

        if (last == null) last = item;
        
        if (front == null) 
            front = item;
        else {
            item.next = front;
            front.pre = item;
            front = item;
        }
    }

    public void push_back(int val) {
        size++;
        Item item = new Item();
        item.value = val;

        if (front == null) front = item;
        
        if (last == null) {
            last = item;
        } else {
            item.pre = last;
            last.next = item;
            last = item;
        }
    }

    public void pop_front() {
        if (front == null) System.out.println(-1);
        else {
            size--;
            System.out.println(front.value);
            front = front.next;
            if (front == null) last = null;
            else front.pre = null;
        }
    }

    public void pop_back() {
        if (last == null) System.out.println(-1);
        else {
            size--;
            System.out.println(last.value);
            last = last.pre;
            if (last == null) front = null;
            else last.next = null;
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
        System.out.println(size);
    }

    public void isEmpty() {
        if (size == 0) System.out.println(1);
        else System.out.println(0);
    }
}

class Item {
    public int value;
    public Item next = null;
    public Item pre = null;
}