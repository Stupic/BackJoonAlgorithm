import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<String,Integer>[] items;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        List<Map<String, Integer>> items = new ArrayList<>();  // List로 변경

        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0]);
            int end = Integer.parseInt(input[1]);
            Map<String, Integer> item = new HashMap<>();
            item.put("s", start);
            item.put("e", end);
            items.add(item);
        }

        items.sort((o1, o2) -> {
            if (Objects.equals(o1.get("e"), o2.get("e"))) {
                return o1.get("s") - o2.get("s");
            }
            return o1.get("e") - o2.get("e");
        });
        int useCnt = 0;
        int end = 0;
        for (Map<String, Integer> item : items) {
            if (item.get("s") >= end) {
                end = item.get("e");
                useCnt++;
            }
        }
        System.out.println(useCnt);
        br.close();
    }
}
