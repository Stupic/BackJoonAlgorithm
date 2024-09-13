
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String input = br.readLine();
            list.add(input);
        }

        //기수정렬 사용
        int idx = -1;
        while (idx < 1) {
            idx++;
            ArrayList<String>[] radix = new ArrayList[200001];  //-100,000 ≤ xi, yi ≤ 100,000
            for (String item : list) {
                String[] split = item.split(" ");
                if (radix[Integer.parseInt(split[idx]) + 100000] == null) {
                    radix[Integer.parseInt(split[idx]) + 100000] = new ArrayList<>();
                }
                radix[Integer.parseInt(split[idx]) + 100000].add(item);
            }

            list.clear();
            for (ArrayList<String> strings : radix) {
                if (strings != null) {
                    list.addAll(strings);
                }
            }
        }
        for (String string : list) {
            System.out.println(string);
        }

        br.close();
    }
}