import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);


        ArrayList<LinkedList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new LinkedList<>());
        }
        boolean[] isVisited = new boolean[N];

        for (int i = 0; i < M ; i++){
            line = br.readLine().split(" ");
            int a = Integer.parseInt(line[0]) -1;
            int b = Integer.parseInt(line[1]) -1;
            list.get(a).add(b);
            list.get(b).add(a);
        }

        int linkCnt = 0;

        for (int i = 0; i < N; i++) {

            if (isVisited[i]) continue;

            linkCnt++;
            LinkedList<Integer> linkList = list.get(i);
            isVisited[i] = true;
            while (!linkList.isEmpty()) {
                int a = linkList.removeFirst();
                if (isVisited[a]) continue;

                isVisited[a] = true;
                for (Integer b: list.get(a)) {
                    if (isVisited[b]) continue;
                    linkList.add(b);
                }
            }
        }

        System.out.println(linkCnt);
        br.close();
    }
}