import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        int V = Integer.parseInt(line[2]);

        HashMap<Integer,Node> map = new HashMap<>();

        for (int i = 0; i < M; i++) {
            line = br.readLine().split(" ");
            int value1 = Integer.parseInt(line[0]);
            int value2 = Integer.parseInt(line[1]);

            Node node1 ;
            Node node2 ;

            if (map.containsKey(value1)) node1 =  map.get(value1);
            else {
                node1 = new Node(value1);
                map.put(value1, node1);
            }

            if (map.containsKey(value2)) node2 =  map.get(value2);
            else {
                node2 = new Node(value2);
                map.put(value2, node2);
            }
            node1.addChild(node2);
            node2.addChild(node1);
        }

        dfs(map,V);
        bfs(map,V);

        br.close();
    }

    public static void bfs (HashMap<Integer,Node> map, int start) {

        Queue<Node> queue = new LinkedList<>();

        LinkedList<Integer> visitSeq = new LinkedList<>();
        Node parentNode = map.get(start);
        if (parentNode == null) {
            System.out.println(start);
            return;
        }

        queue.add(parentNode);
        parentNode.bfs = true;

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            visitSeq.add(currentNode.value);
            Integer[] childrenKeys = currentNode.getChildrenKey(false);

            for (int child : childrenKeys) {
                Node childNode = map.get(child);
                if (!childNode.bfs){
                    queue.add(childNode);
                    childNode.bfs = true;
                }
            }
        }

        for (Integer value : visitSeq) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void dfs (HashMap<Integer,Node> map, int start) {

        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> visitSeq = new LinkedList<>();
        Node parentNode = map.get(start);
        if (parentNode == null) {
            System.out.println(start);
            return;
        }

        stack.push(parentNode);
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode.dfs) {
                continue;
            }

            visitSeq.add(currentNode.value);
            currentNode.dfs= true;
            Integer[] childrenKeys = currentNode.getChildrenKey(true);


            for (int child : childrenKeys) {
                Node childNode = map.get(child);
                if (!childNode.dfs){
                    stack.push(childNode);
                }
            }
        }

        for (Integer value : visitSeq) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

class Node {
    int value;
    boolean bfs = false;
    boolean dfs = false;
    HashMap<Integer,Node> children = new HashMap<>();
    Node(int value) {
        this.value = value;
    }

    public void addChild (Node child) {
        if (!this.children.containsKey(child.value)){
           this.children.put(child.value,child);
        }
    }

    public Integer[] getChildrenKey(boolean isRevers) {
        Integer[] keys = new Integer[children.size()];

        Set<Integer> keySet = children.keySet();
        int i = 0;
        for (Integer key : keySet) {
            keys[i++] = key;
        }

        Arrays.sort(keys, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               if (isRevers) {
                   return o2.compareTo(o1);
               }else{
                   return o1.compareTo(o2);
                }
            }
        });
        return keys;
    }

}