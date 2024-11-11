import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
     static ArrayList<Node> nodes;
     static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int questions = Integer.parseInt(line[1]);

        nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node());
        }

        for (int i = 1; i < n; i++) {
            line = br.readLine().split(" ");
            int nodeA = Integer.parseInt(line[0]) -1;
            int nodeB = Integer.parseInt(line[1]) -1;
            int distance = Integer.parseInt(line[2]);
            nodes.get(nodeA).links.put(nodeB,distance);
            nodes.get(nodeB).links.put(nodeA,distance);
        }


        for (int i = 0; i < questions; i++) {
            line = br.readLine().split(" ");
            int nodeA = Integer.parseInt(line[0]) -1;
            int nodeB = Integer.parseInt(line[1]) -1;
            visited = new boolean[n];
            System.out.println( bfs(nodeA, nodeB, 0));
        }
        br.close();
    }

    private static int bfs(int start, int end, int curDistance) {
        if (start == end) {
            return curDistance;
        }
        visited[start] = true;
        int nextDistance = Integer.MAX_VALUE;
        Node cur = nodes.get(start);
        Set<Integer> links = cur.links.keySet();
        for (Integer next : links) {
            if (!visited[next]) {
                int distance = bfs(next, end, cur.links.get(next));
                if (distance == -1 ) continue;
                if (nextDistance - distance > curDistance) {
                    nextDistance = curDistance + distance;
                }
            }
        }

        return nextDistance;
    }

}

class Node {
    HashMap<Integer, Integer> links = new HashMap<>();
}