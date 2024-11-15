import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int[][] bags = new int[n+1][k+1];

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            items.add(new Item(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        for (int i = 1; i <= n; i++) {
            Item item = items.get(i-1);
            for (int j = 1; j <= k; j++) {
                bags[i][j] = bags[i-1][j];
                if(j - item.weight >= 0){
                    bags[i][j] = Math.max(bags[i][j], bags[i-1][j-item.weight] + item.value);
                }
            }
        }
        System.out.println(bags[n][k]);
        br.close();
    }
}
class Item{
    int weight;
    int value;
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
