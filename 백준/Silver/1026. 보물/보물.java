import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> listA = new ArrayList<>(size);
        ArrayList<Integer> listB = new ArrayList<>(size);

        String[] inputA = br.readLine().split(" ");
        for(int i = 0 ; i < size ; i++){
            listA.add(Integer.parseInt(inputA[i]));
        }
        listA.sort((a,b) -> b-a);
        
        String[] inputB = br.readLine().split(" ");
        for(int i = 0 ; i < size ; i++){
            listB.add(Integer.parseInt(inputB[i]));
        }
        listB.sort((a,b) -> a-b);

        for (int i = 0; i < size; i++) {
            sum += listA.get(i) * listB.get(i);
        }

        System.out.println(sum);
        br.close();
    }

}