import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        String[] inputs = br.readLine().split(" ");
        int unitSize = Integer.parseInt(inputs[0]);
        int money = Integer.parseInt(inputs[1]);

        Stack<Integer> units = new Stack<>();
        for (int i = 0; i < unitSize; i++) {
            units.push(Integer.parseInt(br.readLine()));
        }

        while (!units.isEmpty()) {
            Integer unit = units.pop();
            
            while (money >= unit) {
                money -= unit;
                result++;
            }

            if (money  <= 0) break;
        }

        System.out.println(result);
        br.close();
    }

}