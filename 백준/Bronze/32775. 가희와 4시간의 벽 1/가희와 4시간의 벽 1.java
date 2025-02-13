import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Sab = Integer.parseInt(br.readLine());
        int Fab = Integer.parseInt(br.readLine());
        System.out.println(Sab > Fab ? "flight" : "high speed rail");
        br.close();
    }
}