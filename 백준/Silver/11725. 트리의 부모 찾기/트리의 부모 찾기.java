import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static Node[] nodes;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeCnt = Integer.parseInt(br.readLine());

        nodes = new Node[nodeCnt];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < nodeCnt-1; i++) {
            String[] line = br.readLine().split(" ");
            int node1 = Integer.parseInt(line[0]) -1;
            int node2 = Integer.parseInt(line[1]) -1;
            nodes[node1].children.add(node2);
            nodes[node2].children.add(node1);
        }

        bfs(0);

        for (int i = 1; i < nodeCnt; i++) {
            System.out.println(nodes[i].parent + 1);
        }

        br.close();
    }

    public static void bfs (int start) {

        Queue<Integer> queue = new LinkedList<>();

        nodes[start].parent = -1;
        queue.add(start);

        while (!queue.isEmpty()) {
            Integer parent = queue.poll();
            nodes[parent].children.sort((n1,n2)->n1-n2);
            for (Integer child : nodes[parent].children) {
                if (nodes[child].parent != null) continue;

                nodes[child].parent = parent;
                queue.add(child);
            }
        }
    }
}
class Node {
    Integer parent = null;
    LinkedList<Integer> children = new LinkedList<>();
}