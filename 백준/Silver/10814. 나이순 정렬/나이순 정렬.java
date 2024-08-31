import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<String>> table = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            if (!table.containsKey(age)) {
                table.put(age, new ArrayList<>());
            }

            table.get(age).add(age + " " + name);
        }

        for (int key : table.keySet()) {
            ArrayList<String> list = table.get(key);
            
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

        br.close();
    }

}