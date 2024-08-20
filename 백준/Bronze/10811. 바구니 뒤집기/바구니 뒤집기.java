
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        ArrayList<Integer> basket =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            basket.add(i + 1);
        }

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int start = Integer.parseInt(input[0])-1;
            int end = Integer.parseInt(input[1])-1;

            basket = getBasket(basket,start,end);

        }

        for (Integer integer : basket) {
            System.out.print(integer + " ");
        }

        br.close();
    }

    public static ArrayList<Integer> getBasket(ArrayList<Integer> basket, int start, int end) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        for( int i = 0 ; i < basket.size() ; i++) {
            if(i >= start && i <= end) {
                temp.add(basket.get(i));
            }else{
                result.add(basket.get(i));
            }

            if( i == end ){
                Collections.reverse(temp);
                result.addAll(temp);
            }
        }

        return result;
    }
}