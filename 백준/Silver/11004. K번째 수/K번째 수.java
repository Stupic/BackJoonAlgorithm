import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] line = br.readLine().split(" ");
        int size = Integer.parseInt(line[0]);
        int pos = Integer.parseInt(line[1]);

        line = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(line[i]));
        }

        list.sort((o1, o2) -> o1 - o2);
        System.out.println(list.get(pos-1));

        br.close();
    }

}