
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cmdCnt = Integer.parseInt(br.readLine());
        MyQueue queue = new MyQueue();
        for (int i = 0; i < cmdCnt; i++) {
            String input = br.readLine();
            String[] cmd = input.split(" ");
            switch (cmd[0]) {
                case "push_front":
                    queue.push_front(Integer.parseInt(cmd[1]));
                    break;
                case "push_back":
                    queue.push_back(Integer.parseInt(cmd[1]));
                    break;
                case "pop_front":
                    queue.pop_front();
                    break;
                case "pop_back":
                    queue.pop_back();
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
            //System.out.println(input);
            //queue.printString();
        }
        br.close();
    }
}

class MyQueue {
    Item front = null;
    Item last = null;
    int size  = 0;

    public void push_front(int val) {
        size++;
        Item item = new Item();
        item.value = val;

        if (last == null) {
            last = item;
        }
        if (front == null) {
            front = item;
        }else{
            item.next = front;
            front.pre = item;
            front = item;
        }

    }

    public void push_back(int val) {
        size++;
        Item item = new Item();
        item.value = val;

        if (front == null) {
            front = item;
        }
        if (last == null) {
            last = item;
        }else{
            item.pre = last;
            last.next = item;
            last = item;
        }
    }

    public void pop_front() {
        if (front == null) System.out.println(-1);
        else{
            size--;
            System.out.println(front.value);
            front = front.next;
            if (front == null) last = null;
            else front.pre = null;
        }
    }

    public void pop_back(){
        if (last == null) System.out.println(-1);
        else{
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

    public void printString() {

        System.out.println("----------------------------");
        int fValue = front == null ? -1 : front.value;
        int lValue = last == null ? -1 : last.value;
        System.out.println( "front : " + fValue);
        System.out.println( "back : " + lValue);
        Item value = front;
        while (value != null) {
            System.out.print(value.value);
            if (value.next != null) System.out.print("->");
            else System.out.println();

            value = value.next;
        }
        System.out.println("----------------------------");
        System.out.println();
    }
}

class Item {
    public int value;
    public Item next = null;
    public Item pre = null;
}