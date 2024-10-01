import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        list.sort((o1, o2) -> o1 - o2);

        System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));

        br.close();
    }

}