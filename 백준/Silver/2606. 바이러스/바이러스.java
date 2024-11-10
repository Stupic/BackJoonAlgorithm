import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<int[]> computers = new ArrayList<>();

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            int[] comp = new int[cnt];
            computers.add(comp);
        }

        int lines = Integer.parseInt(br.readLine());
        for (int i = 0; i < lines; i++) {
            String[] line = br.readLine().split(" ");
            int computerA = Integer.parseInt(line[0]) - 1;
            int computerB = Integer.parseInt(line[1]) - 1;
            computers.get(computerA)[computerB] = 1;
            computers.get(computerB)[computerA] = 1;
        }

        int[] isVisited = new int[cnt];


        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        isVisited[0] = 1;
        int infected = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int[] comp = computers.get(cur);
            for (int i = 0; i < comp.length ; i++ ){
                if (isVisited[i] == 0 && comp[i] == 1) {
                    queue.add(i);
                    isVisited[i] = 1;
                    infected++;
                }
            }
        }

        System.out.println(infected);
        br.close();
    }
}
