import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        int sum = a + b + c;

        switch (sum) {
            case 3:
            case 4:
                System.out.println(1);
                break;
            case 5:
            case 6:
                System.out.println(2);
                break;
        }
        br.close();
    }

}
