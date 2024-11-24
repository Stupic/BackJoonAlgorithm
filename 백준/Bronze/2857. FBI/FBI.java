import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            if(input.contains("FBI")){
                list.add(i+1);
            }
        }

        if(list.isEmpty()){
            System.out.print("HE GOT AWAY!");
        }else{
            for (Integer i : list) {
                System.out.print(i + " ");
            }
        }
        br.close();
    }
}