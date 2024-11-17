import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 100000;

        String[] input = br.readLine().split(" ");
        int init = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, init));
        boolean[] visited = new boolean[max + 1];

        int second = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            State cur = queue.poll();
            visited[cur.position] = true;

            if (cur.position == end) {
                second = Math.min(cur.second, second);
                continue;
            }

            if (cur.position + 1 <= max && !visited[cur.position + 1])
                queue.add(new State(cur.second + 1, cur.position + 1));

            if (cur.position - 1 >= 0 && !visited[cur.position - 1])
                queue.add(new State(cur.second + 1, cur.position - 1));

            if (cur.position * 2 <= max && !visited[cur.position * 2])
                queue.add(new State(cur.second + 1, cur.position * 2));

        }
        System.out.println(second);
        br.close();
    }
}

class State {
    int second;
    int position;

    public State(int second, int position) {
        this.second = second;
        this.position = position;
    }
}