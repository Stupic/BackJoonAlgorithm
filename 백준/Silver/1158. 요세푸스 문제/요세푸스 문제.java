import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int step = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<>();
        Node first = new Node();
        first.value = 1;

        Node node = first;
        for (int i = 2; i <= size; i++) {
            Node temp = new Node();
            temp.value = i;
            node.next = temp;
            temp.pre = node;
            node = temp;
        }
        node.next = first;
        first.pre = node;

        Node start = new Node();
        start.next = first;
        while (start.next != start.pre) {
            for (int i = 0; i < step; i++) {
                start = start.next;
            }
            list.add(start.value);
            Node pre = start.pre;
            Node next = start.next;
            pre.next = next;
            next.pre = pre;
        }
        if (list.size() != size) {
            list.add(start.next.value);
        }

        StringBuffer sb = new StringBuffer();
        sb.append("<");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
        br.close();
    }
}

class Node {
    int value;
    Node next = null;
    Node pre = null;
}