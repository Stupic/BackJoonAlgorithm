import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dices = br.readLine().split(" ");
        Map<String, Integer> table = new HashMap<>();
        for (String dice : dices) {
            table.put(dice, table.getOrDefault(dice, 0) + 1);
        }
        // 정렬하기 위해 TreeMap 사용
        TreeMap<String, Integer> sortedTable = new TreeMap<>(
                // Comparator를 사용하여 정렬 규칙을 지정
                (a, b) -> {
                    // Integer를 기준으로 내림차순 정렬
                    int compare = table.get(b).compareTo(table.get(a));
                    // Integer가 같으면 String을 기준으로 내림차순 정렬
                    if (compare == 0) {
                        return b.compareTo(a);
                    }
                    return compare;
                }
        );
        sortedTable.putAll(table);

        String first_key = sortedTable.firstKey();
        int first_value = sortedTable.getOrDefault(first_key, 0);

        if (first_value == 1) {
            System.out.println(Integer.parseInt(first_key) * 100);
        } else if (first_value == 2) {
            System.out.println( 1000 + Integer.parseInt(first_key) * 100);
        } else if (first_value == 3) {
            System.out.println(10000 + Integer.parseInt(first_key) * 1000);
        }

        br.close();
    }
}