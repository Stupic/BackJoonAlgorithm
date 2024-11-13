import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Node> list = new ArrayList<>();
        for (int i = 0; i < cnt; i++) {
            Node node = new Node();
            list.add(node);
        }

        String[] parents = br.readLine().split(" ");
        int rootNum = 0;
        for (int i = 0; i < parents.length; i++) {
            int parentNum = Integer.parseInt(parents[i]);
            list.get(i).parent = parentNum;
            if(parentNum == -1){
                rootNum = i;
            }else{
                list.get(parentNum).children.put(i,list.get(i));
            }
        }
        int removeNodeNum = Integer.parseInt(br.readLine());
        Node removeNode = list.get(removeNodeNum);
        int parentNum = removeNode.parent;
        if(parentNum == -1){
            System.out.println(0);
        }else{
            Node parent = list.get(parentNum);
            parent.children.remove(removeNodeNum);

            int leafCnt = 0;
            Queue<Integer> que = new LinkedList<>();
            que.add(rootNum);

            while(!que.isEmpty()){
                Node node = list.get(que.poll());
                if(node.children.isEmpty()){
                    leafCnt++;
                }else{
                    Set<Integer> children = node.children.keySet();
                    for(Integer child : children){
                        que.add(child);
                    }
                }
            }

            System.out.println(leafCnt);
        }

        br.close();
    }
}

class Node {
    int parent;
    HashMap<Integer,Node> children = new HashMap<>();
}